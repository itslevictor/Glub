package com.example.glub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.glub.databinding.ActivityMainBinding
import com.example.glub.databinding.ActivityNavegarPerfilBinding

class navegarPerfil : AppCompatActivity() {
    private lateinit var binding: ActivityNavegarPerfilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavegarPerfilBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btNavegarPerfil.setOnClickListener {
            val navegarMain = Intent(this, MainActivity::class.java)
            startActivity(navegarMain)
        }
    }
}