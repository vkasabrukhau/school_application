package com.example.school_app.presentation.set_up_page

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.school_app.R

class SetUpPage : Fragment(), View.OnClickListener {
    //TextViews
    lateinit var setup_greeting_text:TextView
    lateinit var setup_age_content_text: TextView
    lateinit var setup_estimated_grade_text: TextView
    lateinit var setup_height_feet_text: TextView
    lateinit var setup_height_inches_text: TextView
    lateinit var setup_weight_text: TextView

    //Buttons
    lateinit var setup_subtract_weight_button: Button
    lateinit var setup_add_weight_button: Button
    lateinit var setup_add_age_button: Button
    lateinit var setup_subtract_age_button: Button
    lateinit var setup_subtract_height_button: Button
    lateinit var setup_add_height_button: Button
    lateinit var setup_submit_button: Button

    //Conversions
    lateinit var setup_greeting_text_string: String
    lateinit var setup_age_content_text_string: String
    var setup_age_content_text_int: Int = 0
    lateinit var setup_estimated_grade_text_string: String
    lateinit var setup_height_feet_text_string: String
    var setup_height_feet_text_int: Int = 0
    lateinit var setup_height_inches_text_string: String
    var setup_height_inches_text_int: Int = 0
    lateinit var setup_weight_text_string: String
    var setup_weight_text_int: Int = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_set_up_page, container, false)

        //Getting All Physical Elements

        //TextViews
        setup_greeting_text = v.findViewById(R.id.setup_greeting_text)
        setup_age_content_text = v.findViewById(R.id.setup_age_content_text)
        setup_estimated_grade_text = v.findViewById(R.id.setup_estimated_grade_text)
        setup_height_feet_text = v.findViewById(R.id.setup_height_feet_text)
        setup_height_inches_text = v.findViewById(R.id.setup_height_inches_text)
        setup_weight_text = v.findViewById(R.id.setup_weight_text)

        //Buttons
        setup_subtract_weight_button = v.findViewById(R.id.setup_subtract_weight_button)
        setup_add_weight_button = v.findViewById(R.id.setup_add_weight_button)
        setup_add_age_button = v.findViewById(R.id.setup_add_age_button)
        setup_subtract_age_button = v.findViewById(R.id.setup_subtract_age_button)
        setup_subtract_height_button = v.findViewById(R.id.setup_subtract_height_button)
        setup_add_height_button = v.findViewById(R.id.setup_add_height_button)
        setup_submit_button = v.findViewById(R.id.setup_submit_button)

        return v
    }

    override fun onClick(v: View?) {
        if(v != null){
            when(v.id){
                setup_add_age_button.id -> {
                    setup_age_content_text_string = setup_age_content_text.text.toString()
                    setup_age_content_text_int = setup_age_content_text_string.toInt() + 1
                    setup_age_content_text.text = setup_age_content_text_int.toString()
                }
                setup_subtract_age_button.id -> {
                    setup_age_content_text_string = setup_age_content_text.text.toString()
                    setup_age_content_text_int = setup_age_content_text_string.toInt() - 1
                    setup_age_content_text.text = setup_age_content_text_int.toString()
                }

                setup_add_height_button.id -> {
                    setup_height_feet_text_string = setup_height_feet_text.text.toString()
                    setup_height_inches_text_string = setup_height_inches_text.text.toString()
                    setup_height_feet_text_int = setup_height_feet_text_string.toInt()
                    setup_height_inches_text_int = setup_height_inches_text_string.toInt() + 1
                    if(setup_height_inches_text_int == 12){
                        setup_height_feet_text_int += 1
                        setup_height_inches_text_int = 0
                    }
                    else{
                        setup_height_feet_text.setText(setup_height_feet_text_int)
                        setup_height_inches_text.setText(setup_height_inches_text_int)
                    }
                }
                setup_subtract_height_button.id -> {
                    setup_height_feet_text_string = setup_height_feet_text.text.toString()
                    setup_height_inches_text_string = setup_height_inches_text.text.toString()
                    setup_height_feet_text_int = setup_height_feet_text_string.toInt()
                    setup_height_inches_text_int = setup_height_inches_text_string.toInt() - 1
                    if(setup_height_inches_text_int == 0){
                        setup_height_feet_text_int -= 1
                        setup_height_inches_text_int = 11
                    }
                    else{
                        setup_height_feet_text.setText(setup_height_feet_text_int)
                        setup_height_inches_text.setText(setup_height_inches_text_int)
                    }
                }

                setup_add_weight_button.id -> {
                    setup_weight_text_string = setup_weight_text.toString()
                    setup_weight_text_int = setup_weight_text_string.toInt() + 1
                    setup_weight_text.setText(setup_weight_text_int)
                }

                setup_subtract_weight_button.id -> {
                    setup_weight_text_string = setup_weight_text.toString()
                    setup_weight_text_int = setup_weight_text_string.toInt() - 1
                    setup_weight_text.setText(setup_weight_text_int)
                }

                setup_submit_button.id -> {

                }
            }
        }
    }
}