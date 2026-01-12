package com.example.authmodule.di

import com.example.authmodule.data.AuthRepositoryImpl
import com.example.authmodule.domain.repository.AuthRepository
import com.example.authmodule.domain.use_case.ValidateLoginInputUseCase
import com.example.authmodule.domain.use_case.ValidateRegisterInputUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideValidateLoginInputUseCase(): ValidateLoginInputUseCase{
        return ValidateLoginInputUseCase()
    }

    @Provides
    @Singleton
    fun provideValidateRegisterInputUseCase(): ValidateRegisterInputUseCase{
        return ValidateRegisterInputUseCase()
    }

    @Provides
    @Singleton
    fun provideAuthRepository(): AuthRepository{
        return AuthRepositoryImpl()
    }
}