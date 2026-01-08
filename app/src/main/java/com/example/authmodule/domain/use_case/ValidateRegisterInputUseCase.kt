package com.example.authmodule.domain.use_case

import com.example.authmodule.domain.model.RegisterInputValidationType
import com.example.authmodule.util.containsNumbers
import com.example.authmodule.util.containsSpecialChar
import com.example.authmodule.util.containsUpperCase

class ValidateRegisterInputUseCase {

    operator fun invoke(
        email: String,
        password: String,
        passwordRepeated: String
    ): RegisterInputValidationType {
        if (email.isEmpty() || password.isEmpty() || passwordRepeated.isEmpty()) {
            return RegisterInputValidationType.EmptyField
        }
        if ("@" !in email){
            return RegisterInputValidationType.NoEmail
        }
        if (password != passwordRepeated){
            return RegisterInputValidationType.PasswordDoNotMatch
        }
        if (password.count() < 8){
            return RegisterInputValidationType.PasswordTooShort
        }
        if (!password.containsNumbers()){
            return RegisterInputValidationType.PasswordNumberMissing
        }
        if (!password.containsUpperCase()){
            return RegisterInputValidationType.PasswordUpperCaseMissing
        }
        if (!password.containsSpecialChar()){
            return RegisterInputValidationType.PasswordSpecialCharMissing
        }
        return RegisterInputValidationType.Valid

    }
}