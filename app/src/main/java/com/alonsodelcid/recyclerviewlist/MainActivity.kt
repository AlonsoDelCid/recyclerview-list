package com.alonsodelcid.recyclerviewlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val names = resources.getStringArray(R.array.names)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = NamesAdapter()

        (recyclerView.adapter as NamesAdapter).setNamesList(names.asList())

    }
}