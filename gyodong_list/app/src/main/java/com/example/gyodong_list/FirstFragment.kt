package com.example.gyodong_list

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class FirstFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val items = mutableListOf<String>()
        items.add("꾸물꾸물~~")
        items.add("흐물흐물~~")
        items.add("쿠당탕탕~~")

        val rv = view.findViewById<RecyclerView>(R.id.gyodongRV)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        view.findViewById<ImageView>(R.id.image2).setOnClickListener{
            it.findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }
        view.findViewById<ImageView>(R.id.image3).setOnClickListener{
            it.findNavController().navigate(R.id.action_firstFragment_to_thirdFragment)
        }
        return view
    }

}