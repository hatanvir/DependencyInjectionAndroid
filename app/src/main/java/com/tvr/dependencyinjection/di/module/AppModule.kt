package com.tvr.dependencyinjection.di.module

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * This will provide application class instance
 */
@Module
class AppModule(var myApplication: Application) {
    @Singleton //for creating a single instance
    @Provides //for provide instance when need
    fun provideApplication(): Application {
        return myApplication
    }
}