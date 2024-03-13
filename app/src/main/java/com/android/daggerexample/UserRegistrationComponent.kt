package com.android.daggerexample

import dagger.Component

@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity) // function name doesn't matter - pass the consumer. Provided object in the consumer where @Inject on field
}