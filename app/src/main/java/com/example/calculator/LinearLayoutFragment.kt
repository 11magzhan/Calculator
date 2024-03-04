package com.example.calculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.calculator.databinding.FragmentLinearLayoutBinding

class LinearLayoutFragment : Fragment() {

    private var _binding: FragmentLinearLayoutBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}