package com.example.zad2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Front : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.before)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun sortB(view: View) {
        val input: EditText = findViewById(R.id.input)
        if (input.text.toString().isNotEmpty()) {
            val secondActivity = Intent(this, Back::class.java);
            secondActivity.putExtra("String", input.text.toString())
            Log.i("iE", input.text.toString())
            secondActivity.putExtra("Type", true)
            startActivity(secondActivity)
        }
    }
    fun wyb(view: View) {
        val input: EditText = findViewById(R.id.input)
        if (input.text.toString().isNotEmpty()) {
            val secondActivity = Intent(this, Back::class.java);
            secondActivity.putExtra("String", input.text.toString())
            Log.i("iE", input.text.toString())
            secondActivity.putExtra("Type", true)
            startActivity(secondActivity)
        }
    }
}