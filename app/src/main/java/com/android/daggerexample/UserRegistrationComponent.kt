package com.android.daggerexample

import dagger.BindsInstance
import dagger.Component

@ActivityScope
@Component(dependencies = [AppComponent::class], modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity) // function name doesn't matter - pass the consumer. Provided object in the consumer where @Inject on field

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance retryCount: Int, appComponent: AppComponent): UserRegistrationComponent
    }

}