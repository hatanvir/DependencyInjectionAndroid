package com.tvr.dependencyinjection.di.component

import com.tvr.dependencyinjection.MainActivity
import com.tvr.dependencyinjection.di.module.ApiModule
import com.tvr.dependencyinjection.di.module.AppModule
import dagger.Component

/**
 * this is a bridge for module and consumer
 */
@Component(modules = [AppModule::class, ApiModule::class])
interface PowerComponent {
    fun inject(mainActivity: MainActivity)
}