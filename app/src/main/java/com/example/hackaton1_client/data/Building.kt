package com.example.hackaton1_client.data

data class Building(
    val landlord: Int,
    val address: String,
    val lease_start: String,
    val lease_end: String,
    val personal: List<Int>,
    val get_personal: Map<String, Personal>,
    val services: List<Int>,
    val get_services: List<>
) : java.io.Serializable
