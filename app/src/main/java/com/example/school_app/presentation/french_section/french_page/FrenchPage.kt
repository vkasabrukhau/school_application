package com.example.school_app.presentation.french_section.french_page

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.Navigation
import com.example.school_app.R


class FrenchPage : Fragment(), View.OnClickListener {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_french_page, container, false)

        var materials = v.findViewById<ConstraintLayout>(R.id.french_materials_tab_layout)
        var homework = v.findViewById<ConstraintLayout>(R.id.french_homework_tab_layout)


        return v
    }

    override fun onClick(v: View?) {
        if(v != null){
            when(v.id){
                R.id.french_homework_tab_layout -> {
                    Navigation.findNavController(v).navigate(R.id.frenchMaterials)
                }
                /*R.id.french_materials_tab_layout -> {
                    Navigation.findNavController(v).navigate(R.id.)
                }*/
            }
        }
    }
}