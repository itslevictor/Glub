package com.example.glub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class ConfirmacaoActivity : AppCompatActivity() {
    private lateinit var binding:ConfirmacaoActivity
    private lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        database = Firebase.database.reference
        setContentView(R.layout.activity_confirmacao)
    }
}