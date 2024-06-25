package com.example.zad2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.zad2.databinding.AfterBinding
import java.lang.Exception

class Back : AppCompatActivity() {

    lateinit var binding: AfterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AfterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val extras = intent.extras ?: return
        val sortType = extras.getBoolean("Type")
        val input = extras.getString("String")
        val info: TextView = binding.info
        if (input.isNullOrEmpty()) {
            info.text = getString(R.string.error)
            return
        }
        if (sortType) {
            sortB(input)
        }
        else
            wyb(input)
    }
    fun backToMain() {
        try {
            val MainActivity = Intent(this, Front::class.java)
            startActivity(MainActivity)
        }catch (e: Exception){
            Log.i("i", "coś nie tak")
        }
    }
    @SuppressLint("CutPasteId")
    private fun sortB(input: String) {
//        val extras = intent.extras ?: return
        //val input = extras.getString("String")
        val before: TextView = binding.before
        val after: TextView = binding.after
        val info: TextView = binding.info
        Log.i("i", input)
        val numbers2 = input.split(" ")
        Log.i("i", numbers2.size.toString())
        Log.i("i", numbers2.toString())
        val numbers: ArrayList<Int> = ArrayList()
        numbers2.forEach() {
            try {
                numbers.add(it.toInt())
            } catch (e: NumberFormatException) {
                info.text = getString(R.string.error2)
                return
            }
        }
        before.text = numbers.toString()
        for (i in 0..<numbers.size-1) {
            for (j in 0..<numbers.size-1) {
                if (numbers[j]>numbers[j+1]) {
                    val temp = numbers[j]
                    numbers[j]=numbers[j+1]
                    numbers[j+1]=temp
                }

            }
        }
        Log.i("i", numbers.toString())
        after.text=numbers.toString()
        info.text=getString(R.string.infoB)

    }

    private fun wyb(input: String) {
//        val extras = intent.extras ?: return
        //val input = extras.getString("String")
        val before: TextView = binding.before
        val after: TextView = binding.after
        val info: TextView = binding.info
        Log.i("i", input)
        val numbers2 = input.split(" ")
        Log.i("i", numbers2.size.toString())
        Log.i("i", numbers2.toString())
        val numbers: ArrayList<Int> = ArrayList()
        numbers2.forEach() {
            try {
                numbers.add(it.toInt())
            } catch (e: NumberFormatException) {
                info.text = getString(R.string.error2)
                return
            }
        }
        before.text = numbers.toString()
        for (i in 0..numbers.size-1) {
            var mn = i
            for (j in i + 1..numbers.size-1) {
                if (numbers[j] < numbers[mn]) {
                    mn = j
                }
            }
            val temp = numbers[i]
            numbers[i] = numbers[mn]
            numbers[mn] = temp
        }
        Log.i("i", numbers.toString())
        after.text=numbers.toString()
        info.text=getString(R.string.infoB)

    }


}
