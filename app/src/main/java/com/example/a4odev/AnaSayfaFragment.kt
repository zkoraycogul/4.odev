package com.example.a4odev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.a4odev.databinding.FragmentAnaSayfaBinding

class AnaSayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentAnaSayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnaSayfaBinding.inflate(inflater, container, false)

        tasarim.directionA.setOnClickListener {
        Navigation.findNavController(it).navigate(R.id.anaSayfadanAyaGecis)
        }

        tasarim.directionX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anaSayfadanXGecis)
        }



        return tasarim.root
    }
}