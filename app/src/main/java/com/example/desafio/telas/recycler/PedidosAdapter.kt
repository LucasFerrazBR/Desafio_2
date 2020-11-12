package com.example.desafio.telas.recycler


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio.R
import com.example.desafio.domain.PedidosInfo

class PedidosAdapter (val listPedidos: List<PedidosInfo>): RecyclerView.Adapter<PedidosAdapter.PedidosInfoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PedidosInfoViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.pedidos_card_body, parent, false)
        return PedidosInfoViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PedidosInfoViewHolder, position: Int) {
        val currentItem = listPedidos[position]

        holder.text_pedidosNome.setText(currentItem.nome)
    }

    override fun getItemCount() = listPedidos.size

    class PedidosInfoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val text_pedidosNome: TextView = itemView.findViewById(R.id.pedidos_card_nome)
    }
}