package com.example.hackaton1_client.network

import android.widget.ImageView
import com.example.hackaton1_client.data.Building
import com.example.hackaton1_client.data.CommercialObject
import com.google.android.material.imageview.ShapeableImageView

object NetworkQueries {

    fun setBuildingPicture(building: Building, imageView: ShapeableImageView){
        RetrofitClient.setPictureByURL(building.photo_build, imageView)
    }





    fun getBuildings(awaiter:(List<Building>)->Unit){
        RetrofitClient.getAPI().getAllBuildings(1).enqueue(
            DataCallback<List<Building>>{
                awaiter(it)
            }
        )
    }

    fun getCommercialObjects(building: Int, awaiter:(List<CommercialObject>)->Unit){

    }
}