import android.util.Log
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.firestore

data class User(
    val firstName: String = "",
    val middleName: String = "",
    val lastName: String = "",
    val email: String = "",
    val program: String = "",
    val studentNumber: String = ""
)

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
                    val isAdmin = document.getBoolean("isAdmin")
                    Log.d("UserData", "isAdmin: $isAdmin")
                    if (isAdmin != null) {
                        onResult(isAdmin)
                    }
                    else {
                        onResult(false)
                    }
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