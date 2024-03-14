package com.example.androidsample
import com.example.androidsample.databinding.ActivityMainBinding

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun convertCurrency(view: View){
//        val dollarText: EditText = findViewById(R.id.dollarText)
//        val textView: TextView = findViewById(R.id.textView)

        if (binding.dollarText.text.isNotEmpty()) {
            val dollarValue = binding.dollarText.text.toString().toFloat()
            val euroValue = dollarValue*0.85F
            binding.textView.text=euroValue.toString()
        } else {
            binding.textView.text = getString(R.string.no_value_string)
        }
    }
}