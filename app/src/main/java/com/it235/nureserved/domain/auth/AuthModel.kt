package com.it235.nureserved.domain.auth

data class User(
    val firstName: String = "",
    val middleName: String = "",
    val lastName: String = "",
    val email: String = "",
    val program: String = "",
    val studentNumber: String = ""
)