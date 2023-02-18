package com.example.hackaton1_client.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.hackaton1_client.R
import com.example.hackaton1_client.fragments.ObjectsFragment

class MainActivity : AppCompatActivity() {
    enum class Choices {
        OBJECTS,
        PAYMENTS,
        PROFILE
    }


    private fun setMainFragment(newFragment: Fragment){
        supportFragmentManager.commit{
            add(R.id.main_fragment, newFragment)
        }
    }


    private fun makeChoice(choice: Choices){
        when (choice){
            Choices.OBJECTS -> {
                setMainFragment(ObjectsFragment())
            }
            Choices.PAYMENTS ->{
                //setMainFragment(PaymentsFragment())
            }
            Choices.PROFILE ->{
                //setMainFragment(ProfileFragment())
            }
            else -> {
                throw Exception("No such choice")
            }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        makeChoice(Choices.OBJECTS)


    }
}