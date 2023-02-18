package com.example.hackaton1_client.data

data class BuildingsAnswerList(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Building>
) : java.io.Serializable
