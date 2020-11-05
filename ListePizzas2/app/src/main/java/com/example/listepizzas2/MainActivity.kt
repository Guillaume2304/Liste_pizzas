package com.example.listepizzas2

import android.icu.util.TimeUnit.values
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview = findViewById<ListView>(R.id.listPizzas)
        var list = mutableListOf<Model>()

        list.add(Model(getString(R.string.margueriteText), getString(R.string.margueriteIngredientsText), R.drawable.pizza_marguerite))
        list.add(Model(getString(R.string.reineText), getString(R.string.reineIngredientsText), R.drawable.pizza_reine))
        list.add(Model(getString(R.string.chorizoText), getString(R.string.chorizoIngredientsText), R.drawable.pizza_chorizo))
        list.add(Model(getString(R.string.fromagesText), getString(R.string.fromagesIngredientsText), R.drawable.pizza_8fromages))
        list.add(Model(getString(R.string.sicilienneText), getString(R.string.sicilienneIngredientsText), R.drawable.pizza_sicilienne))
        list.add(Model(getString(R.string.calzoneText), getString(R.string.chorizoIngredientsText), R.drawable.pizza_calzone))

        listview.adapter = Adapter(this, R.layout.row, list)

        listview.setOnItemClickListener{ parent: AdapterView<*>, view: View, position: Int, id:Long ->
            if (position == 0) {
                Toast.makeText(this@MainActivity, "Vous avez choisi une pizza " + R.string.margueriteText, Toast.LENGTH_LONG).show()
            }
            if (position == 1) {
                Toast.makeText(this@MainActivity, "Vous avez choisi une pizza " + R.string.reineText, Toast.LENGTH_LONG).show()
            }
            if (position == 2) {
                Toast.makeText(this@MainActivity, "Vous avez choisi une pizza " + R.string.chorizoText, Toast.LENGTH_LONG).show()
            }
            if (position == 3) {
                Toast.makeText(this@MainActivity, "Vous avez choisi une pizza " + R.string.fromagesText, Toast.LENGTH_LONG).show()
            }
            if (position == 4) {
                Toast.makeText(this@MainActivity, "Vous avez choisi une pizza " + R.string.sicilienneText, Toast.LENGTH_LONG).show()
            }
            if (position == 5) {
                Toast.makeText(this@MainActivity, "Vous avez choisi une pizza " + R.string.calzoneText, Toast.LENGTH_LONG).show()
            }
        }
    }
}