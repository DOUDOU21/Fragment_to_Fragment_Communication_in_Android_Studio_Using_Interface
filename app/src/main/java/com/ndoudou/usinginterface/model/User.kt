package com.ndoudou.usinginterface.model
import java.io.Serializable
data class User(
    var nom: String?,
    var prenom: String?,
    var email: String?
)  : Serializable
