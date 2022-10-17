    package com.example.glub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.glub.databinding.ActivityMainBinding

    class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btLogin.setOnClickListener{
            val navegarLogin = Intent(this, Login::class.java)
            startActivity(navegarLogin)
        }
    }
}