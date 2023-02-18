package com.example.hackaton1_client.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.example.hackaton1_client.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Здесь входим в аккаунт
        //Пока просто проверяем связь с сервером

        startActivity(Intent(this, MainActivity::class.java))
        finish()


    }
}