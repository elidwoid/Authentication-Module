package com.example.authmodule.domain.model

enum class RegisterInputValidationType {
    EmptyField,
    NoEmail,
    PasswordDoNotMatch,
    PasswordUpperCaseMissing,
    PasswordNumberMissing,
    PasswordSpecialCharMissing,
    PasswordTooShort,
    Valid
}