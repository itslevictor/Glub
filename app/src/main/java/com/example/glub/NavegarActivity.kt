package com.example.glub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.glub.databinding.ActivityCarrinhoBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

//import com.example.glub.databinding.ActivityNavegarPerfilBinding

    class NavegarActivity : AppCompatActivity(){
    private lateinit var binding: ActivityCarrinhoBinding
    private lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        database = Firebase.database.reference
        binding = ActivityCarrinhoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btNavegarPerfil.setOnClickListener {
            val navegar = Intent(this, MainActivity::class.java)
            startActivity(navegar)
        }
    }
}