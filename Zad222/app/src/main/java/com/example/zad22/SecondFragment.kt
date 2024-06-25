package com.example.zad22

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.zad22.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun sortBubble(numbers: ArrayList<Int>) {
        val before: TextView = binding.beforeNumbers
        val after: TextView = binding.afterNumbers
        val info: TextView = binding.sortInfo
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
        info.text=getString(R.string.bubbleSortInfo)

    }

    fun selectSort(numbers: ArrayList<Int>) {
        val before: TextView = binding.beforeNumbers
        val after: TextView = binding.afterNumbers
        val info: TextView = binding.sortInfo

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
        info.text=getString(R.string.SelectSortInfo)

    }
    fun test() {
        Log.i("i", "Działa")
    }
}