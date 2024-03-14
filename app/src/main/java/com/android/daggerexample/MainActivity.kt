package com.android.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService  // Field injection

    @Inject
    lateinit var emailService1: EmailService
    @Inject
    lateinit var emailService2: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = (application as UserApplication).appComponent

        val userRegistrationComponent = appComponent.getUserRegistrationComponent()
        userRegistrationComponent.inject(this)
        userRegistrationService.registerUser("uday144@gmail.com", "11111")
    }
}