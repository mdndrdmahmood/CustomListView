package com.hasnast.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var listView:ListView
    val users = arrayOf("Mushfiqur Rahman",
        "Maradona", "Kotlin",
        "Papon", "Messi"
        "Shakib AlHassan",
        "Mominul Islam",
        "Mostafizur Rahman",
        "Rubel", "Minhaz",
        "Rakibul", "Taskin Ahmed",
        "Mahmudullah Riad",
        "Nazmul Hossain Shanto",
        "Rishad Hossain")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, users)

        listView.adapter = arrayAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val selectedItem = users[position] // Assuming `users` is the list of items displayed in the ListView
            Toast.makeText(this@MainActivity, "Selected: $selectedItem", Toast.LENGTH_SHORT).show()
        }
    }