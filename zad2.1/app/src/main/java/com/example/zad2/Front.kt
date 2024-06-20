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
import com.example.zad2.databinding.BeforeBinding

class Front : AppCompatActivity() {

    lateinit var binding: BeforeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = BeforeBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun sortB(view: View) {
        val input: EditText = binding.input
        if (input.text.toString().isNotEmpty()) {
            val secondActivity = Intent(this, Back::class.java);
            secondActivity.putExtra("String", input.text.toString())
            Log.i("iE", input.text.toString())
            secondActivity.putExtra("Type", true)
            startActivity(secondActivity)
        }
    }
    fun wyb(view: View) {
        val input: EditText = binding.input
        if (input.text.toString().isNotEmpty()) {
            val secondActivity = Intent(this, Back::class.java);
            secondActivity.putExtra("String", input.text.toString())
            Log.i("iE", input.text.toString())
            secondActivity.putExtra("Type", true)
            startActivity(secondActivity)
        }
    }
}