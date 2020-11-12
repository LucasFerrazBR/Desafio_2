package com.example.desafio.telas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.desafio.R

class RestaurantesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurantes)

        val frag =  CardFragment.newInstance()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frame_layout, frag)
            commit()
        }
    }
}