package com.example.desafio.domain

data class CardInfo (var nome: String, var endereco: String, var fecha: String) {

    override fun toString(): String {
        return "Cards(nome = '$nome', endereco = '$endereco', fecha = '$fecha,)"
    }
}