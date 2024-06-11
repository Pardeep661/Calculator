package com.pardeep.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.setPadding

class MainActivity : AppCompatActivity() {

    var plus_button: Button? = null
    var Minus_button: Button? = null
    var multiply_button: Button? = null
    var divide_button: Button? = null
    var edit_text : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        plus_button = findViewById(R.id.plus_button)
        Minus_button = findViewById(R.id.minus_button)
        multiply_button = findViewById(R.id.multiply_button)
        divide_button = findViewById(R.id.divide_buton)
        edit_text = findViewById(R.id.data)





        plus_button?.setOnClickListener(){
            val current_value = edit_text?.text?.toString()
            val new_data = (current_value?.toInt()?:0) + 2
            edit_text?.setText(new_data.toString())
        }

        Minus_button?.setOnClickListener(){
            val current_value = edit_text?.text?.toString()
            val new_data = (current_value?.toInt() ?: 0 ) - 2
            edit_text?.setText(new_data.toString())
        }

        multiply_button?.setOnClickListener(){
            val current_value = edit_text?.text?.toString()
            val new_data = (current_value?.toInt() ?: 0) * 2
            edit_text?.setText(new_data.toString())
        }

        divide_button?.setOnClickListener(){
            val current_value = edit_text?.text?.toString()
            val new_data = (current_value?.toInt() ?: 0) / 2
            edit_text?.setText(new_data.toString())
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}


