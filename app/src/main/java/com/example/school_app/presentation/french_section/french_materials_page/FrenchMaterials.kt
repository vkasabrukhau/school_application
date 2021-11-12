package com.example.school_app.presentation.french_section.french_materials_page

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.example.school_app.R
import java.time.LocalDate


class FrenchMaterials : Fragment() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_french_materials, container, false)
        val today = LocalDate.now().toString()
        val todayInfo = today.split("-")


        var french_materials_month = v.findViewById<TextView>(R.id.french_materials_nav_bar_month)
        french_materials_month.setText(todayInfo[1])
        var french_materials_date = v.findViewById<TextView>(R.id.french_materials_nav_bar_date)
        french_materials_date.setText(todayInfo[2])
        var french_materials_year = v.findViewById<TextView>(R.id.french_materials_nav_bar_year)
        french_materials_year.setText(todayInfo[0])

        return v
    }

}