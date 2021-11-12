package com.example.school_app.presentation.classes_page

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.school_app.R


class ClassesPage : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_classes_page, container, false)
        var classesRecyclerView: RecyclerView = v.findViewById(R.id.classes_recyclerView)
        var gridLayoutManager = GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false)
        classesRecyclerView.layoutManager = gridLayoutManager
        classesRecyclerView.adapter = ClassesAdapter()
        return v
    }
}