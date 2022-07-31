package com.tvr.dependencyinjection.network

import com.tvr.dependencyinjection.models.PostData
import retrofit2.http.GET

interface ApiInterface {
    @GET("/posts")
    fun getPosts():PostData
}