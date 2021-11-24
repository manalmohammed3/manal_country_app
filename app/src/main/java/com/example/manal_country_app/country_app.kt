package com.example.manal_country_app

interface country_app {

    @GET("images")
    suspend fun getPhoto(): List<datamodel>



}