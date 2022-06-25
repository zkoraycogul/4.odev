package com.example.a4odev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.a4odev.databinding.FragmentSayfaBBinding
import com.example.a4odev.databinding.FragmentSayfaXBinding

class SayfaXFragment : Fragment() {
    private lateinit var tasarim:FragmentSayfaXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        tasarim = FragmentSayfaXBinding.inflate(inflater, container, false)

        tasarim.directionXtoY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.XdenYyeGecis)
        }

        return tasarim.root
    }
}