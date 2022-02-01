package com.example.firstunittest

object RegistrationObject {
    private val existingEmails = listOf("janis@mail.com","anna@mail.com")
    public fun validateRegistrationInput(
        email: String,
        password: String,
        confirmPassword: String
    ): Boolean {
        var inputCorrect = true
        for (eachEmail in existingEmails) {
            if (email == eachEmail) {
                inputCorrect = false
                break
            }
        }
        if (email == "") {
            inputCorrect = false
        }
        if (password == "" || confirmPassword == "") {
            inputCorrect = false
        }
        if (password != confirmPassword) {
            inputCorrect = false
        }
        return inputCorrect
    }
}