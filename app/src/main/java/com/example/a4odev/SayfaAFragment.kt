package com.example.a4odev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.a4odev.databinding.FragmentSayfaABinding

class SayfaAFragment : Fragment() {
    private lateinit var tasarim:FragmentSayfaABinding
      override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
          tasarim = FragmentSayfaABinding.inflate(inflater, container, false)

          tasarim.directionB.setOnClickListener {
              Navigation.findNavController(it).navigate(R.id.AdanByeGecis)
          }

        return tasarim.root
    }
}