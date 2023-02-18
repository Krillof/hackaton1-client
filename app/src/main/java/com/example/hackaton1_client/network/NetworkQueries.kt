package com.example.hackaton1_client.network

import com.example.hackaton1_client.data.CommercialObject

object NetworkQueries {
    fun getCommercialObjects(awaiter:(List<CommercialObject>)->Unit){

        awaiter(ArrayList())
    }
}