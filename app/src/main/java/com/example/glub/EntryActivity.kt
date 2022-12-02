package com.example.glub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.glub.databinding.ActivityAvaliacaoBinding.inflate
import com.example.glub.databinding.ActivityLoginBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

//import com.example.glub.databinding.ActivityEntryBinding

class EntryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        database = Firebase.database.reference
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btMain.setOnClickListener{
            val navegarMain = Intent(this, MainActivity::class.java)
            startActivity(navegarMain)
        }
    }
}