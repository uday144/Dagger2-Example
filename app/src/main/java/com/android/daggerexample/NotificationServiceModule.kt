package com.android.daggerexample

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationServiceModule() {

    @ActivityScope  // whenever use @Provides and need singleton obj then use @Singleton
    @MessageQualifier
    @Provides
    fun getMessageService() : NotificationService{
        return MessageService(10)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService) : NotificationService{
        return emailService
    }
}