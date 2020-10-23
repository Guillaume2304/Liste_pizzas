package com.example.versionslist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val andVersionArray = mutableListOf(AndVersion("Plane", R.drawable.plane), AndVersion("Train", R.drawable.train), AndVersion("Car", R.drawable.car))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        seedItems()
        andVersionRecyclerView.layoutManager = LinearLayoutManager(this)
        andVersionRecyclerView.adapter = AndVersionAdapter(andVersionArray)
    }

    fun seedItems(){

        var nameArray = resources.getStringArray(R.array.andVersionName)
        val imgArray = intArrayOf(R.drawable.plane, R.drawable.train, R.drawable.car)
        for (i in 0..(nameArray.size-1))
            andVersionArray[i] = AndVersion(nameArray[i], imgArray[i])
    }


}
