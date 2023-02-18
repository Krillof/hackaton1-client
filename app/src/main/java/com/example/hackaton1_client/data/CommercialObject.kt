package com.example.hackaton1_client.data

data class CommercialObject(
    val building: Int,
    val building_address: String,
    val leaser: Int,
    val leaser_name: String,
    val rent_price: Int,
    val square: Double,
    val description: String,
    val document: String?
) : java.io.Serializable
