package com.example.hackaton1_client.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hackaton1_client.R

class CommercialObjectsListActivity : AppCompatActivity() {

    public val BUILDING_ID = "BUILDING_ID"

    var building_id: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_commertial_objects_list)

        val _building_id: Int? = intent.extras?.get(BUILDING_ID) as Int?
        building_id = _building_id!!


    }

}