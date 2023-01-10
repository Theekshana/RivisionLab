package com.example.navi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val button = view.findViewById<Button>(R.id.button)
        button.setOnClickListener {
            navigateToSecond()

        }
        return view
    }

    private fun navigateToSecond() {

        val action =
            FirstFragmentDirections.actionFirstFragmentToSecondFragment("Theekshana", "Vimukthi")
        findNavController().navigate(action)
    }


}