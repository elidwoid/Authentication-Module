package com.example.authmodule.presentation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.authmodule.presentation.viewmodel.LoginViewModel
import com.example.authmodule.presentation.viewmodel.RegisterViewModel

@Composable
fun RegisterScreen(
    onRegisterSuccessNavigation: () -> Unit,
    onNavigateToLoginScreen: () -> Unit,
    registerViewModel: RegisterViewModel = hiltViewModel()
){

}