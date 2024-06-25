package com.example.zad22

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentActivity
import com.example.zad22.databinding.ActivityMainBinding



class MainActivity : FragmentActivity(), FirstFragment.FirstListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets
            ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right,
                systemBars.bottom)
            insets
        }
    }

    override fun onButtonClickBubble(int: ArrayList<Int>) {
        val test = supportFragmentManager.findFragmentById(R.id.fragmentContainerView3) as SecondFragment
        test.onDestroy()
        test.sortBubble(int)
        Log.i("i", "JD")
    }

    override fun onButtonClickSelect(int: ArrayList<Int>) {
        val test = supportFragmentManager.findFragmentById(R.id.fragmentContainerView3) as SecondFragment
        test.onDestroy()
        test.selectSort(int)
        Log.i("i", "JD2")
    }
}