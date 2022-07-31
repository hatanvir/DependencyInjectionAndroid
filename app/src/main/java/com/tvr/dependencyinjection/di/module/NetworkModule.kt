package com.tvr.dependencyinjection.di.module

import android.app.Application
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule(var baseUrl: String) {
    @Singleton
    @Provides
    fun provideGsonConvertFactory(gson: Gson):GsonConverterFactory{
        return GsonConverterFactory.create()
    }

    @Singleton
    @Provides
    fun provideGson():Gson{
        return GsonBuilder().setLenient().create()
    }

    @Singleton
    @Provides
    fun provideCache(application:Application): Cache {
        val cacheSize = 10 * 1024 * 1024
        return Cache(application.cacheDir, cacheSize.toLong())
    }

    @Singleton
    @Provides
    fun provideHttpClient(cache: Cache,interceptor: Interceptor):OkHttpClient{
        return OkHttpClient.Builder()
            .cache(cache)
            .addInterceptor(interceptor)
            .build()
    }

    @Singleton
    @Provides
    fun provideRetrofit(okkHttpClient: OkHttpClient,gsonConverterFactory: GsonConverterFactory):Retrofit{
        return Retrofit.Builder()
            .addConverterFactory(gsonConverterFactory)
            .client(okkHttpClient)
            .baseUrl(baseUrl)
            .build()
    }
}