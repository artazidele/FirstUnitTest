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
}