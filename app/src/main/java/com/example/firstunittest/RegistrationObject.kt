package com.example.firstunittest

object RegistrationObject {
    private val existingEmails = listOf("janis@mail.com","anna@mail.com")
    public fun validateRegistrationInput(
        email: String,
        password: String,
        confirmPassword: String
    ): Boolean {
        return true
    }
}