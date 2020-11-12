package com.example.desafio.telas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.desafio.R

class PedidosActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedidos)

        val frag = PedidosFragment.newInstance()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frame_layout2, frag)
            commit()


        //val frag2 = DetailPedidosFragment.newInstance()
        //supportFragmentManager.beginTransaction().apply {
            //replace(R.id.frame_layout3, frag2)
            //commit()
           //}
        }
    }
}