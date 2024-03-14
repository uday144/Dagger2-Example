package com.android.daggerexample

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class UserRepositoryModule {

    @Binds // UserRepository binds with sqlRepository ( Dagger can create object if not then use @Provides). All @Binds function are abstract since no object creation required.
    @ActivityScope // Suppose no access of SQLRepository then use  @Singleton here
    abstract fun getSQLRepository(sqlRepository: SQLRepository): UserRepository
}