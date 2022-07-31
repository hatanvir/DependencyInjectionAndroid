package com.tvr.dependencyinjection.di.module

import com.tvr.dependencyinjection.network.ApiInterface
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [NetworkModule::class])
object ApiModule {
    @Singleton
    @Provides
    fun provideApi(retrofit: Retrofit):ApiInterface{
        return retrofit.create(ApiInterface::class.java)
    }
}