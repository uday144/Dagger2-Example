package com.android.daggerexample

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class, AnalyticsModule::class])
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity) // function name doesn't matter - pass the consumer. Provided object in the consumer where @Inject on field

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance retryCount: Int): UserRegistrationComponent
    }

}