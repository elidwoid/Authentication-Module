package com.example.authmodule.domain.use_case

import com.example.authmodule.domain.model.LoginInputValidationType
import com.example.authmodule.domain.use_case.ValidateLoginInputUseCase
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class ValidateLoginInputUseCaseTest {

    private val validateLoginInputUseCase = ValidateLoginInputUseCase()

    @Test
    fun `test empty email field return validation type empty field`(){
        val result = validateLoginInputUseCase(email = "", password = "password")
        assertThat(result).isEqualTo(LoginInputValidationType.EmptyField)
    }

    @Test
    fun `test empty password field return validation type empty field`(){
        val result = validateLoginInputUseCase(email = "email@gmail.com", password = "")
        assertThat(result).isEqualTo(LoginInputValidationType.EmptyField)
    }

    @Test
    fun `test no email return validation type no email`(){
        val result = validateLoginInputUseCase(email = "emailgmail.com", password = "password")
        assertThat(result).isEqualTo(LoginInputValidationType.NoEmail)
    }

    @Test
    fun `test test everything is correct return validation type valid`(){
        val result = validateLoginInputUseCase(email = "email@gmail.com", password = "password")
        assertThat(result).isEqualTo(LoginInputValidationType.Valid)
    }
}