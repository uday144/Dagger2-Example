package com.android.daggerexample

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationServiceModule() {

    @ApplicationScope  // whenever use @Provides and need singleton obj then use @Singleton
    @MessageQualifier
    @Provides
    fun getMessageService(retryCount: Int) : NotificationService{
        return MessageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService) : NotificationService{
        return emailService
    }
}