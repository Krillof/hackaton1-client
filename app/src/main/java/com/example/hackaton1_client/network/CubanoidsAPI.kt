package com.example.hackaton1_client.network

import retrofit2.http.GET

interface CubanoidsAPI {
    @GET("/Buildings")
    fun getAllBuildings(

    )

    @GET("/CommercialObjects")
    fun getAllCommercialObjects()
}