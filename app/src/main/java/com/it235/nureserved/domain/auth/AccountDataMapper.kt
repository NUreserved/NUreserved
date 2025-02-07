package com.it235.nureserved.domain.auth

class AccountDataMapper {
    companion object {
        fun generateAccountDetailsHashMap(
            firstName: String,
            middleName: String,
            lastName: String,
            program: String,
            role: String,
            email: String,
            school: String
        ): HashMap<String, Any> {
            var data: HashMap<String, Any> = hashMapOf()

            if (role == "Student") {
                data = hashMapOf(
                    "firstName" to firstName,
                    "middleName" to middleName,
                    "lastName" to lastName,
                    "program" to program,
                    "role" to role,
                    "email" to email,
                    "isVerified" to false
                )
            } else if (role == "Educator") {
                data = hashMapOf(
                    "firstName" to firstName,
                    "middleName" to middleName,
                    "lastName" to lastName,
                    "school" to school,
                    "role" to role,
                    "email" to email,
                    "isVerified" to false
                )
            }
            return data
        }
    }
}