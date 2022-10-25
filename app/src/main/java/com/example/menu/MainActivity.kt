package com.example.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_save -> Toast.makeText(this, "Guardar", Toast.LENGTH_SHORT).show()
            R.id.action_lenguaje -> Toast.makeText(this, "Lenguaje", Toast.LENGTH_SHORT).show()
            R.id.action_profile -> Toast.makeText(this, "Perfil", Toast.LENGTH_SHORT).show()
            R.id.action_exit -> Toast.makeText(this, "Salir", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}