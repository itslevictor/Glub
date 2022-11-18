    package com.example.glub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.glub.databinding.ActivityMainBinding
import com.example.glub.databinding.ActivityNavegarPerfilBinding

    class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        this.binding.btLogin.setOnClickListener {
            val navegarLogin = Intent(this, Login::class.java)
            startActivity(navegarLogin)
        }
        this.binding.btPerfil.setOnClickListener {
            val navegarPerfil = Intent(this, navegarPerfil::class.java)
            startActivity(navegarPerfil)
        }
        this.binding.btFornecedor.setOnClickListener {
            val navegarPerfil = Intent(this, navegarPerfil::class.java)
            startActivity(navegarPerfil)
        }
        this.binding.btPedidos.setOnClickListener {
            val navegarPerfil = Intent(this, navegarPerfil::class.java)
            startActivity(navegarPerfil)
        }
        this.binding.btCarrinho.setOnClickListener {
            val navegarPerfil = Intent(this, navegarPerfil::class.java)
            startActivity(navegarPerfil)
        }
        this.binding.btCarrinho.setOnClickListener {
            val navegarPerfil = Intent(this, navegarPerfil::class.java)
            startActivity(navegarPerfil)
        }
        this.binding.btMapa.setOnClickListener {
            val navegarPerfil = Intent(this, navegarPerfil::class.java)
            startActivity(navegarPerfil)
        }
    }
}