package com.android.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val userRegistrationService = UserRegistrationService()
        userRegistrationService.registerUser("uday144@gmail.com", "11111")
    }
}