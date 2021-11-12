package com.example.school_app.presentation.classes_page

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.school_app.R

class ClassesAdapter: RecyclerView.Adapter<ClassesAdapter.ViewHolder>() {

    var class_names = listOf<String>("Comp Science", "Pre-Calculus", "Modern Euro", "French", "Biology", "P.E.")
    var class_icons = listOf<Int>(R.drawable.icons8_briefcase_100, R.drawable.icons8_box_100, R.drawable.icons8_box_100, R.drawable.icons8_box_100, R.drawable.icons8_box_100, R.drawable.icons8_box_100)

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var class_title: TextView = itemView.findViewById(R.id.class_name)
        var class_image: ImageView = itemView.findViewById(R.id.class_image)

        fun onBind(class_name: String, class_icon: Int) {
            class_title.text = class_name
            class_image.setImageResource(class_icon)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v: View = LayoutInflater.from(parent.context).inflate(R.layout.custom_class_item_layout, parent, false)
        var classViewHolder: ViewHolder = ViewHolder(v)
        classViewHolder.class_image.setOnClickListener(){
            /*if(classViewHolder.class_title.text.equals("Pre-Calculus") && v != null){
                Navigation.findNavController(v).navigate(R.id.)
            }*/
            if(classViewHolder.class_title.text.equals("French") && v != null){
                Navigation.findNavController(v).navigate(R.id.frenchPage)
            }
        }
        return classViewHolder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(class_names[position], class_icons[position])
    }

    override fun getItemCount(): Int {
        return class_names.size
    }
}