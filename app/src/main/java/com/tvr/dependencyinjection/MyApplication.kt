package com.tvr.dependencyinjection

import android.app.Application
import com.tvr.dependencyinjection.di.component.PowerComponent

class MyApplication: Application() {
    lateinit var powerComponent: PowerComponent
    override fun onCreate() {
        super.onCreate()
         //powerComponent = DaggerPowerComponent.builder()
    }
}