package com.example.desafio.telas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.desafio.R
import com.example.desafio.domain.PedidosInfo
import com.example.desafio.telas.recycler.PedidosAdapter
import kotlinx.android.synthetic.main.fragment_pedidos.view.*

class PedidosFragment : Fragment(){

    private var listPedidos = getListPedidos()
    private val adapter = PedidosAdapter(listPedidos)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_pedidos, container, false)

        view.lista_pedidos_cards.adapter = adapter
        view.lista_pedidos_cards.layoutManager = LinearLayoutManager(context)
        view.lista_pedidos_cards.setHasFixedSize(true)

        return view
    }

    fun getListPedidos(): ArrayList<PedidosInfo> {

        val card0 = PedidosInfo("Salada de molho com gengibre")
        val card1 = PedidosInfo("Salada de molho com gengibre")
        val card2 = PedidosInfo("Salada de molho com gengibre")
        val card3 = PedidosInfo("Salada de molho com gengibre")

        val listPedidos = arrayListOf<PedidosInfo>(
            card0,
            card1,
            card2,
            card3
        )

        return listPedidos

    }

    companion object{
        fun newInstance() = PedidosFragment()
    }
}