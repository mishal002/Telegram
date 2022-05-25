package com.example.telegram

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.example.telegram.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity()
{

    lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.menu.setOnClickListener {
            binding.DrawerLayout.openDrawer(GravityCompat.START)
        }
    }
}

