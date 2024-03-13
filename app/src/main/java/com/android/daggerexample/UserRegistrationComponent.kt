package com.android.daggerexample

import dagger.Component

@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService(): UserRegistrationService

    fun getEmailService(): EmailService
}