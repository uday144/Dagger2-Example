package com.android.daggerexample

class UserRegistrationService {

    private val userRepository = UserRepository()
    private val emailService = EmailService()

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.send(email, "no-reply@devconsole.com", "User Registered")
    }

/*  Problem with code
*  unit testing
*  single responsibility
*  Lifetime of the object
*  Extensible
*/

}









