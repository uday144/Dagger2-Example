package com.android.daggerexample

import android.util.Log
import javax.inject.Inject


interface UserRepository {
    fun saveUser(email: String, password: String)
}
class SQLRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User Saved in DB")
    }
}

class FirebaseRepository : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User Saved in Firebase")
    }
}