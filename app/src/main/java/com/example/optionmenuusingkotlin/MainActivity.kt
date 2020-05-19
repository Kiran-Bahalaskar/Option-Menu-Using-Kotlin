package com.example.optionmenuusingkotlin

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
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        var selectedOption = ""

        when(item.itemId)
        {
            R.id.menu_about -> selectedOption = "About Us"
            R.id.menu_help -> selectedOption = "Help"
            R.id.item_1 -> selectedOption = "Item 1"
            R.id.item_2 -> selectedOption = "Item 2"
            R.id.item_3 -> selectedOption = "Item 3"
        }
        Toast.makeText(this,"Option : $selectedOption", Toast.LENGTH_SHORT).show()

        return super.onOptionsItemSelected(item)
    }
}
