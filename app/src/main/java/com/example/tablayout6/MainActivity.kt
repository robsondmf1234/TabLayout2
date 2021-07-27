package com.example.tablayout6

import android.icu.text.CaseMap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.tablayout6.repositorio.Mock
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val fragmentList: MutableList<Fragment> = ArrayList()

        val titleList: MutableList<String> = ArrayList()
        titleList.add("Todos")
        titleList.add("Aventura")
        titleList.add("Drama")
        titleList.add("Ficcao")
        titleList.add("Drama")
        titleList.add("Comedia")
        //Quantidade de categorias que possuem na lista de filmes
        val qtdCategorias: Int = Mock().getQuantidadeCategoria()

        //val categoria = "Todos"
        //Recupera da classe Mock uma lista com filmes
        //val listaComFilmes = Mock().getListaFiltradaFilmes(categoria)

        pager.adapter = MyFragmentAdapter(this, qtdCategorias)

        //Preencher o titulo do Tablayout de acordo com a lista
        TabLayoutMediator(tabs, pager) { tab, position ->
            when (position) {
                0 -> tab.text = titleList[position]
                1 -> tab.text = titleList[position]
                2 -> tab.text = titleList[position]
                3 -> tab.text = titleList[position]
                4 -> tab.text = titleList[position]
                5 -> tab.text = titleList[position]
                6 -> tab.text = titleList[position]
            }
        }.attach()

        //Capturando clique no BottomNavigation
        bottomNavigation.setOnNavigationItemSelectedListener { item ->

            when (item.itemId) {
                R.id.icon_home -> {
                    Toast.makeText(this, "Botao Home clicado!", Toast.LENGTH_SHORT).show()
                    // val fragmentAdapter = MyPageAdapter(supportFragmentManager)

                    true
                }
                R.id.icon_favorite -> {
                    Toast.makeText(this, "Botao Favorite clicado!!", Toast.LENGTH_SHORT).show()

                    pager.adapter = MyFragmentAdapter(this, qtdCategorias)

                    //Adicionar o Fragment Favorite a tela inicial

                    //tabLayout.setupWithViewPager(viewPager)
                    true
                }
                R.id.icon_search -> {
                    Toast.makeText(this, "Botao Search clicado!", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }
}
