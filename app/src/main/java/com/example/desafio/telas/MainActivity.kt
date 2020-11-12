package com.example.desafio.telas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.desafio.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.login_body.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botaoLogar.setOnClickListener {
            callRestaurantes()
        }

        botaoPraTelaRegistrar.setOnClickListener {
            callRegistrar()
        }
    }

    fun callRegistrar() {
        var intent = Intent(this, RegistrarActivity::class.java)
        startActivity(intent)
    }

    fun callRestaurantes() {
        var intent = Intent(this, RestaurantesActivity::class.java)
        startActivity(intent)
    }
}