package com.example.desafio.telas.recycler


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio.R
import com.example.desafio.domain.CardInfo

class CardAdapter (val listCards: List<CardInfo>): RecyclerView.Adapter<CardAdapter.CardInfoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardInfoViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.card_body, parent, false)
        return CardInfoViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CardInfoViewHolder, position: Int) {
        val currentItem = listCards[position]

        holder.text_cardNome.setText(currentItem.nome)
        holder.text_cardEndereco.setText(currentItem.endereco)
        holder.text_cardFecha.setText(currentItem.fecha)
        }

    override fun getItemCount() = listCards.size

    class CardInfoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val text_cardNome: TextView = itemView.findViewById(R.id.card_nome)
        val text_cardEndereco: TextView = itemView.findViewById(R.id.card_endereco)
        val text_cardFecha: TextView = itemView.findViewById(R.id.card_fecha)
        val card_image: ImageView = itemView.findViewById(R.id.card_imagem)

    }
}