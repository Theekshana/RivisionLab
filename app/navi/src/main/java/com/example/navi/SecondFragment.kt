package com.example.navi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.example.navi.databinding.FragmentFirstBinding
import com.example.navi.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass.
 * Use the [SecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecondFragment : Fragment() {

    val args: SecondFragmentArgs by navArgs()
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        //val view = inflater.inflate(R.layout.fragment_second, container, false)

        binding = FragmentSecondBinding.inflate(inflater, container, false)

        val showName = args.user.name
        binding.result.text = "Name $showName"

       /* val showName = view.findViewById<TextView>(R.id.result)

        val showDetails = args.user.name
       // showName.text = "Name + $showDetails"
        showName.text = "$showDetails"
*/


        /*val fname = args.fname
        val lname = args.lname
        showName.text = "Name : $fname $lname"
*/

        return binding.root
    }


}