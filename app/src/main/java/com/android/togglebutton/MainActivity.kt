package com.android.togglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {

    lateinit var view : TextView
    lateinit var image : ImageView
    lateinit var toggle : ToggleButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toggle = findViewById(R.id.toggleButton)
        image = findViewById(R.id.image)
        view = findViewById(R.id.View)

        toggle.setOnCheckedChangeListener { compoundButton, isChecked ->

            if(isChecked) {
                image.visibility = View.INVISIBLE
                view.text = ("The image is invisible")
            }
            else {
                image.visibility = View.VISIBLE
                view.text = ("The image is visible")
            }

        }
    }
}