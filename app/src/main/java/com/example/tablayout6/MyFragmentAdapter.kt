package com.example.tablayout6

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyFragmentAdapter(fa: FragmentActivity, qtdAbas: Int) : FragmentStateAdapter(fa) {

    val qtdAbas = qtdAbas

    //retorna a quantidade de abas que tera no Tablayout
    override fun getItemCount(): Int {
        return qtdAbas
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> SimpleFragment("Todos")
            1 -> SimpleFragment("Aventura")
            2 -> SimpleFragment("Acao")
            3 -> SimpleFragment("Ficcao")
            4 -> SimpleFragment("Drama")
            5 -> SimpleFragment("Comedia")
            else -> SimpleFragment("Favorite")
        }
    }
}