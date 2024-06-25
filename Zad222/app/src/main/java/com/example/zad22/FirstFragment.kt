package com.example.zad22

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import com.example.zad22.databinding.FragmentFirstBinding
import javax.net.ssl.CertPathTrustManagerParameters

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!
    var activityCallback: FirstListener? = null
//    var activityCallback2: SecondListener? = null

    interface FirstListener {
        fun onButtonClickBubble(int: ArrayList<Int>)
        fun onButtonClickSelect(int: ArrayList<Int>)
    }
//    interface SecondListener {
//        fun onButtonClickSelect(text: String)
//    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            activityCallback = context as FirstListener
        } catch (e: ClassCastException) {
            throw ClassCastException(context.toString()
                    +"trzeba zaimplementować pierwszy listener")
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.bubble.setOnClickListener{v: View -> bubbleSort(v)}
        binding.wstaw.setOnClickListener {v: View -> selectSort(v)}
    }

    private fun bubbleSort(view: View) {
        var input2: EditText = binding.input
        var input = input2.text.toString()
        var info = binding.errorInfo
        Log.i("i", "JESTEM W METODZIE bubbleSort")
        Log.i("i", input2.toString())
        if (!check1(input)) {
            Log.i("i", "return1")
            info.text = getString(R.string.error)
            return
        }
        if (!check2(input)) {
            Log.i("i", "return2")
            info.text = getString(R.string.error2)
            return
        }
        var list = makeList(input)
        Log.i("i", list.toString())
        info.text = ""
        activityCallback?.onButtonClickBubble(list)
    }
    private fun selectSort(view: View) {
        var input2: EditText = binding.input
        var input = input2.text.toString()
        var info = binding.errorInfo
        Log.i("i", "JESTEM W METODZIE selectSORT")
        Log.i("i", input2.toString())
        if (!check1(input)) {
            Log.i("i", "return1")
            info.text = getString(R.string.error)
            return
        }
        if (!check2(input)) {
            Log.i("i", "return2")
            info.text = getString(R.string.error2)
            return
        }
        var list = makeList(input)
        Log.i("i", list.toString())
        info.text = ""
        activityCallback?.onButtonClickSelect(list)
    }

    private fun makeList(input: String): ArrayList<Int> {
        val numbers2 = input.split(" ")
        val numbers: ArrayList<Int> = ArrayList()
        numbers2.forEach() {
                numbers.add(it.toInt())
        }
        return numbers
    }



    fun check1(input: String): Boolean {
        if (input.isNullOrEmpty()) {
            return false
        }
        return true
    }


    fun check2(input: String): Boolean {
        Log.i("i", input)
        val numbers2 = input.split(" ")
        Log.i("i", numbers2.size.toString())
        Log.i("i", numbers2.toString())
        val numbers: ArrayList<Int> = ArrayList()
        numbers2.forEach() {
            try {
                numbers.add(it.toInt())
            } catch (e: NumberFormatException) {
                return false
            }
        }
        return true
    }


}