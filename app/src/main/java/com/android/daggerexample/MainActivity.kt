package com.android.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService  // Field injection


    lateinit var emailService1: EmailService
    lateinit var emailService2: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.factory().create(4)

        emailService1 = component.getEmailService()
        emailService2 = component.getEmailService()


        val component2 = DaggerUserRegistrationComponent.factory().create(4)

        emailService1 = component2.getEmailService()
        emailService2 = component2.getEmailService()

        component.inject(this)
        userRegistrationService.registerUser("uday144@gmail.com", "11111")
    }
}