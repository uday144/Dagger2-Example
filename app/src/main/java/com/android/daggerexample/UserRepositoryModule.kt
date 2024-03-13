package com.android.daggerexample

import dagger.Module
import dagger.Provides

@Module
class UserRepositoryModule {

    @Provides
    fun getSQLRepository(sqlRepository: SQLRepository): UserRepository {
        return sqlRepository  // User want sqlRepository and Dagger can create sqlRepository by own (@Inject) so return sqlRepository
    }

}