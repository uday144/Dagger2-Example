package com.android.daggerexample

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AnalyticsModule {

    @Provides
    fun getAnalyticsService() : AnalyticsService{
        return Mixpanel()
    }

}