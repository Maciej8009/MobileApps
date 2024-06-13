package com.example.zad22

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.zad22.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//      setContentView(R.layout.activity_main)

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }


//        val fragment1btn = findViewById<Button>(R.id.button)
//        val fragment2btn = findViewById<Button>(R.id.button2)

//        fragment1btn.setOnClickListener {
//
//        }
//        fragment2btn.setOnClickListener {
//
//        }

    }


//    fun sortB(view: View) {
//        val input: EditText = findViewById(R.id.input)
//        val info: TextView = findViewById(R.id.infoText)
//        val before: TextView = findViewById(R.id.beforeText)
//        val after: TextView = findViewById(R.id.afterText)
//        if (input.text.toString().isNotEmpty()) {
//            before.text = input.text.toString()
//            val numbers2 = input.text.split(" ")
//            Log.i("i", numbers2.size.toString())
//            val numbers: ArrayList<Int> = ArrayList()
//            numbers2.forEach(){
//                try {
//                    numbers.add(it.toInt())
//                } catch (e: NumberFormatException){
//                    info.text=getString(R.string.error2)
//                    return
//                }
//            }
//            for (i in 0..<numbers.size-1) {
//                for (j in 0..<numbers.size-1) {
//                    if (numbers[j]>numbers[j+1]) {
//                        val temp = numbers[j]
//                        numbers[j]=numbers[j+1]
//                        numbers[j+1]=temp
//                    }
//
//                }
//            }
//            Log.i("i", numbers2.toString())
//            after.text=numbers.toString()
//            info.text=getString(R.string.infoB)
//        }
//    }
//    fun wyb(view: View) {
//        val input: EditText = findViewById(R.id.input)
//        val info: TextView = findViewById(R.id.infoText)
//        val before: TextView = findViewById(R.id.beforeText)
//        val after: TextView = findViewById(R.id.afterText)
//        if (input.text.toString().isNotEmpty()) {
//            before.text = input.text.toString()
//            val numbers2 = input.text.split(" ")
//            Log.i("i", numbers2.size.toString())
//            val numbers: ArrayList<Int> = ArrayList()
//            numbers2.forEach(){
//                //Log.i("--------------------", it.toString())
//                try {
//                    numbers.add(it.toInt())
//                } catch (e: NumberFormatException){
//                    info.text=getString(R.string.error2)
//                    return
//                }
//            }
//            for (i in 0..numbers.size-1) {
//                var mn=i
//                for (j in i+1..numbers.size-1) {
//                    if(numbers[j]<numbers[mn]) {
//                        mn=j
//                    }
//                }
//                val temp = numbers[i]
//                numbers[i]=numbers[mn]
//                numbers[mn]=temp
//            }
//            after.text=numbers.toString()
//            info.text=getString(R.string.infoW)
//        } else {
//            info.text=getString(R.string.error)
//        }
//    }



}