package com.example.desafio.telas

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.desafio.R
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.register_body.*

class RegistrarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        setSupportActionBar(findViewById(R.id.toolbar_register))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val toastPreencha = Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT)
        val toastSenha = Toast.makeText(this, "Senhas diferentes", Toast.LENGTH_SHORT)

        botaoRegistrar.setOnClickListener {
            val nome = edName.text.toString()
            val email = email_logar.text.toString()
            val senha = senha_logar.text.toString()
            val senhaConfirmar = senha_ConfirmLogar.text.toString()
            if (nome.isNotEmpty() && email.isNotEmpty() && senha.isNotEmpty() && senhaConfirmar.isNotEmpty()) {
                if (senha.equals(senhaConfirmar)) {
                    callRestaurantes()
                }else{
                    toastSenha.show()
                }
            }
            else {
                toastPreencha.show()
            }
        }
    }

    fun callRestaurantes() {
        var intent = Intent(this, RestaurantesActivity::class.java)
        startActivity(intent)
    }
}