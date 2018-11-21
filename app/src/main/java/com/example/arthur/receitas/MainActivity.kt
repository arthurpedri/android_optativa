package com.example.arthur.receitas

import android.content.Intent
import android.os.Build.VERSION_CODES.N
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import java.security.AccessController.getContext

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            val intent = Intent(this, NewRecipe::class.java)
            startActivity(intent)
        }

        button_japao.setOnClickListener {view ->
            val intent = Intent(this, CategoriaLista::class.java)
                intent.putExtra("buttonNumber", 1)
                startActivity(intent);
        }

        button_china.setOnClickListener {view ->
            val intent = Intent(this, CategoriaLista::class.java)
            intent.putExtra("buttonNumber", 2)
            startActivity(intent);
        }

        button_italia.setOnClickListener {view ->
            val intent = Intent(this, CategoriaLista::class.java)
            intent.putExtra("buttonNumber", 3)
            startActivity(intent);
        }

        button_coreia.setOnClickListener {view ->
            val intent = Intent(this, CategoriaLista::class.java)
            intent.putExtra("buttonNumber", 4)
            startActivity(intent);
        }

        button_mexico.setOnClickListener {view ->
            val intent = Intent(this, CategoriaLista::class.java)
            intent.putExtra("buttonNumber", 5)
            startActivity(intent);
        }

        button_outro.setOnClickListener {view ->
            val intent = Intent(this, CategoriaLista::class.java)
            intent.putExtra("buttonNumber", 6)
            startActivity(intent);
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }




}
