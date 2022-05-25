package com.example.telegram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class slpesh_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slpesh_screen)

        Handler().postDelayed(
            {
                val intent = Intent(this,login_screen::class.java)
                startActivity(intent)
                finish()
            },3000)

    }
}