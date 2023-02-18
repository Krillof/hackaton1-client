package com.example.hackaton1_client.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.hackaton1_client.R
import com.example.hackaton1_client.fragments.CommercialObjectsFragment

class MainActivity : AppCompatActivity() {
    enum class Choices {
        OBJECTS,
        PAYMENTS,
        PROFILE
    }


    private fun setMainFragment(newFragment: Fragment?){
        if (newFragment == null) Toast.makeText(this, "Не готово)", Toast.LENGTH_SHORT).show()
        else
            supportFragmentManager.commit{
                add(R.id.main_fragment, newFragment)
            }
    }


    private fun makeChoice(choice: Choices){
        setMainFragment(when (choice){
            Choices.OBJECTS ->CommercialObjectsFragment()
            Choices.PAYMENTS -> null
            Choices.PROFILE -> null
            else -> throw Exception("No such choice")
        })
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        makeChoice(Choices.OBJECTS)

    }
}