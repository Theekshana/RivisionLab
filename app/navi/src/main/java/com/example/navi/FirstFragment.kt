package com.example.navi

import android.app.ProgressDialog.show
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navi.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding:FragmentFirstBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        //val view = inflater.inflate(R.layout.fragment_first, container, false)

        //data binding
        binding = FragmentFirstBinding.inflate(inflater, container, false)


        binding.button.setOnClickListener {

            val strName = binding.name.text.toString()

            when{
                strName.isBlank() ->Toast.makeText(context,"Enter valid name ",Toast.LENGTH_LONG).show()


            else ->{
                val user = User(strName)
                val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(user)
                findNavController().navigate(action)
            }
            }



            /*val user = User(strName)
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(user)
            findNavController().navigate(action)*/


        }
        return binding.root

        /* val name:EditText = view.findViewById(R.id.name)
        val button = view.findViewById<Button>(R.id.button)
        button.setOnClickListener {

            val strName = name.text.toString()
            val user = User(strName)

            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(user)
            findNavController().navigate(action)
            //navigateToSecond()

        }
        return view
    }*/

        /*private fun navigateToSecond() {

        val action =
            FirstFragmentDirections.actionFirstFragmentToSecondFragment("Theekshana", "Vimukthi")
        findNavController().navigate(action)
    }*/

    }


}

