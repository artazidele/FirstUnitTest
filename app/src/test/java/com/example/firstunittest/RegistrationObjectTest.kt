package com.example.firstunittest


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationObjectTest {

    @Test
    fun `empty username returns false`() {
        val result = RegistrationObject.validateRegistrationInput(
            "",
            "arta.zidele",
            "arta.zidele"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `existing username returns false`() {
        val result = RegistrationObject.validateRegistrationInput(
            "anna@mail.com",
            "arta.zidele",
            "arta.zidele"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        val result = RegistrationObject.validateRegistrationInput(
            "arta@mail.com",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `passwords do not match returns false`() {
        val result = RegistrationObject.validateRegistrationInput(
            "arta@mail.com",
            "arta.zidele",
            "arta.zi"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `correct email and both passwords match returns true`() {
        val result = RegistrationObject.validateRegistrationInput(
            "arta@mail.com",
            "arta.zidele",
            "arta.zidele"
        )
        assertThat(result).isTrue()
    }
}