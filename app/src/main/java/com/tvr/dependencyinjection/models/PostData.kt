package com.tvr.dependencyinjection.models

import com.google.gson.annotations.SerializedName

/**
 * this is a pojo class of posts response
 */
data class PostData (
    @SerializedName("userId" ) var userId : Int?    = null,
    @SerializedName("id"     ) var id     : Int?    = null,
    @SerializedName("title"  ) var title  : String? = null,
    @SerializedName("body"   ) var body   : String? = null
)