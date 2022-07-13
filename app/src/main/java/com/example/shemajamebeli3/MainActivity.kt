package com.example.shemajamebeli3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shemajamebeli3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    private val Adapter: Adapter by lazy{
        Adapter()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }
    private fun init(){
        binding.types.adapter = Adapter
    }


}