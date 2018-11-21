package com.example.arthur.receitas

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView
import com.example.arthur.receitas.R.id.fab
import com.example.arthur.receitas.R.id.toolbar

import kotlinx.android.synthetic.main.activity_categoria_lista.*

class CategoriaLista : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categoria_lista)
        setSupportActionBar(toolbar)
        val pressedButtonNumber = intent.getIntExtra("buttonNumber", 0)
        val category = findViewById<TextView>(R.id.categoria_list)
        when(pressedButtonNumber){
            1 -> category.text = "Japonesa"
            2 -> category.text = "Chinesa"
            3 -> category.text = "Italiana"
            4 -> category.text = "Coreana"
            5 -> category.text = "Mexicana"
            else -> category.text = "Outros"

        }


        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

}
