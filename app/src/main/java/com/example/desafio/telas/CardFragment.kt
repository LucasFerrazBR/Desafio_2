package com.example.desafio.telas

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.desafio.R
import com.example.desafio.domain.CardInfo
import com.example.desafio.telas.recycler.CardAdapter
import kotlinx.android.synthetic.main.fragment_card.view.*

class CardFragment : Fragment(){

    private var listCards = getListCard()
    private val adapter = CardAdapter(listCards)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_card, container, false)

        view.lista_cards.adapter = adapter
        view.lista_cards.layoutManager = LinearLayoutManager(context)
        view.lista_cards.setHasFixedSize(true)

        return view
    }

    fun getListCard(): ArrayList<CardInfo> {

        val card0 = CardInfo("Tony Roma's", "Av. Lavandisca, 717 - Indianopolis, São Paulo", "Fecha as 22:00")
        val card1 = CardInfo("Ayoama - Moema", "Alameda dos Arapanés, 532 - Moema", "Fecha as 00:00")
        val card2 = CardInfo("Outback - Moema", "Av. Moaci, 187 - Moema, São Paulo", "Fecha as 00:00")
        val card3 = CardInfo("Sí Señor!", "Alameda Jauperi, 627 - Moema", "Fecha as 01:00")

        val listCards = arrayListOf<CardInfo>(
            card0,
            card1,
            card2,
            card3
        )

        return listCards

    }

    companion object{
        fun newInstance() = CardFragment()
    }

    fun callPedidos() {
        var intent = Intent(activity, PedidosActivity::class.java)
        startActivity(intent)
        }
    }