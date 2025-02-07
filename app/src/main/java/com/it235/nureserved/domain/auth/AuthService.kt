import android.util.Log
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.FirebaseAuthInvalidUserException
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.firestore
import com.it235.nureserved.domain.auth.AccountDataMapper.Companion.generateAccountDetailsHashMap
import com.it235.nureserved.domain.auth.User

class AuthService {
    companion object {
        fun isSignedIn(): Boolean {
            val auth = FirebaseAuth.getInstance()
            val user = auth.currentUser
            val userId = user?.uid

            if (userId != null) {
                return true
            }

            Log.w("AuthService", "User not logged in")
            return false
        }

        fun isVerified(): Boolean {
            val auth = FirebaseAuth.getInstance()
            val user = auth.currentUser

            if (user != null && user.isEmailVerified) {
                return true
            }

            Log.w("AuthService", "Account is not yet verified.")
            return false
        }

        fun getUserData(onResult: (User?) -> Unit) {
            val auth = FirebaseAuth.getInstance()
            val firestore = Firebase.firestore
            val currentUser = auth.currentUser

            if (currentUser != null) {
                val uid = currentUser.uid
                val userDocRef = firestore.collection("user").document(uid)

                userDocRef.get()
                    .addOnSuccessListener { document ->
                        if (document != null && document.exists()) {
                            val user = document.toObject(User::class.java)
                            Log.d("UserData", "User: $user")
                            onResult(user)
                        } else {
                            Log.d("UserData", "Document does not exist")
                            onResult(null)
                        }
                    }
                    .addOnFailureListener { exception ->
                        Log.d("UserData", "Error getting documents: ", exception)
                        onResult(null)
                    }
            } else {
                Log.d("UserData", "No current user")
                onResult(null)
            }
        }

        fun checkIfAdmin(onResult: (Boolean) -> Unit) {
            val auth = FirebaseAuth.getInstance()
            val firestore = Firebase.firestore
            val currentUser = auth.currentUser

            if (currentUser != null) {
                val uid = currentUser.uid
                val userDocRef = firestore.collection("user").document(uid)

                userDocRef.get()
                    .addOnSuccessListener { document ->
                        if (document != null && document.exists()) {
                            val isAdmin = document.getBoolean("isAdmin") ?: false
                            Log.d("UserData", "isAdmin: $isAdmin")
                            onResult(isAdmin)
                        } else {
                            Log.d("UserData", "Document does not exist")
                            onResult(false)
                        }
                    }
                    .addOnFailureListener { exception ->
                        Log.d("UserData", "Error getting documents: ", exception)
                        onResult(false)
                    }
            } else {
                Log.d("UserData", "No current user")
                onResult(false)
            }
        }

        fun signIn(
            email: String, password:
            String,
            onResult: (Boolean, String?) -> Unit
        ) {
            val auth = FirebaseAuth.getInstance()

            auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) { onResult(true, null) }
                    else { onResult(false, loginExceptionMessage(task.exception)) }
                }
        }

        fun signUp(
            email: String,
            password: String,
            firstName: String,
            middleName: String,
            lastName: String,
            program: String,
            role: String,
            school: String,
            onResult: (Boolean, String?) -> Unit
        ) {
            val auth = FirebaseAuth.getInstance()

            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        Log.d("AuthService", "User created successfully with email: $email")
                        insertAccountDetailsToDb(firstName, middleName, lastName, program, role, email, school,
                            insertAccDetailsResult = { success, message ->
                                onResult(success, message)
                            }
                        )
                    } else {
                        Log.e("AuthService", "User creation failed with email: $email", task.exception)
                        onResult(false, loginExceptionMessage(task.exception))
                    }
                }
        }

        private fun insertAccountDetailsToDb(
            firstName: String,
            middleName: String,
            lastName: String,
            program: String,
            role: String,
            email: String,
            school: String,
            insertAccDetailsResult: (Boolean, String?) -> Unit
        ) {
            val auth = FirebaseAuth.getInstance()
            val user = auth.currentUser
            val userId = user?.uid
            val db = FirebaseFirestore.getInstance()
            val data = generateAccountDetailsHashMap(firstName, middleName, lastName, program, role, email, school)

            if (userId != null) {
                // Add data to Firestore
                db.collection("user").document(userId)
                    .set(data)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            Log.d("AuthService", "Account details added to Firestore for user: $userId")
                            sendEmailVerification { success, message ->
                                insertAccDetailsResult(success, message)
                            }
                        } else {
                            Log.e("AuthService", "Failed to add account details to Firestore for user: $userId", task.exception)
                            insertAccDetailsResult(false, genericExceptionMessage(task.exception))
                        }
                    }
            } else {
                Log.e("AuthService", "User ID is null, cannot add account details to Firestore")
            }
        }

        private fun sendEmailVerification(
            sendEmailVerfResult: (Boolean, String?) -> Unit,
        ) {
            val auth = FirebaseAuth.getInstance()
            val user = auth.currentUser
            val userId = user?.uid

            if (userId != null) {
                user.sendEmailVerification()
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            Log.d("AuthService", "Email verification sent successfully to user: $userId")
                            sendEmailVerfResult(true, null)
                        } else {
                            Log.e("AuthService", "Failed to send email verification to user: $userId", task.exception)
                            sendEmailVerfResult(false, genericExceptionMessage(task.exception))
                        }
                    }
            } else {
                Log.e("AuthService", "User ID is null, cannot send email verification")
            }
        }

        private fun loginExceptionMessage(exception: java.lang.Exception?): String {
            val exceptionMessage = when(exception) {
                is FirebaseAuthInvalidCredentialsException -> "Invalid email or password. Please try again."
                is FirebaseAuthInvalidUserException -> {
                    if(exception.errorCode == "ERROR_USER_DISABLED"){
                        "Your account has been disabled. Please contact the administrator."
                    }
                    else{
                        "An unknown error occurred. Please try again."
                    }
                }
                else -> "An unknown error occurred. Please try again."
            }

            return exceptionMessage
        }

        private fun genericExceptionMessage(exception: java.lang.Exception?): String? {
            val exceptionMessage = exception?.message

            return exceptionMessage
        }
    }
}