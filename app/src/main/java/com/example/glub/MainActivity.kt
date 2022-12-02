    package com.example.glub

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.glub.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.Exclude
import com.google.firebase.database.IgnoreExtraProperties
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

    class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var database: DatabaseReference

        override fun onCreate(savedInstanceState: Bundle?) {
        /*
        // Write a message to the database
        val database = Firebase.database
        val myRef1 = database.getReference("1")
        myRef1.setValue("Variavel 1!")
        val myRef2 = database.getReference("2")
        myRef2.setValue("Variavel 2!"*/
        database = Firebase.database.reference

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        this.binding.btLogin.setOnClickListener {
            val entryActivity = Intent(this, EntryActivity::class.java)
            startActivity(entryActivity)
        }
        this.binding.btPerfil.setOnClickListener {
            val navegarActivity = Intent(this, NavegarActivity::class.java)
            startActivity(navegarActivity)
        }
        this.binding.btFornecedor.setOnClickListener {
            val navegarActivity = Intent(this, NavegarActivity::class.java)
            startActivity(navegarActivity)
        }
        this.binding.btPedidos.setOnClickListener {
            val navegarActivity = Intent(this, NavegarActivity::class.java)
            startActivity(navegarActivity)
        }
        this.binding.btCarrinho.setOnClickListener {
            val navegarActivity = Intent(this, NavegarActivity::class.java)
            startActivity(navegarActivity)
        }
        this.binding.btCarrinho.setOnClickListener {
            val navegarActivity = Intent(this, NavegarActivity::class.java)
            startActivity(navegarActivity)
        }
        this.binding.btMapa.setOnClickListener {
            val navegarActivity = Intent(this, NavegarActivity::class.java)
            startActivity(navegarActivity)
        }

    }
}