package com.android.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService  // Field injection
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder()
            .notificationServiceModule(NotificationServiceModule(3)).build()
        component.inject(this)
        userRegistrationService.registerUser("uday144@gmail.com", "11111")
    }
}