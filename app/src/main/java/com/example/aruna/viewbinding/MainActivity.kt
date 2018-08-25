package com.example.aruna.viewbinding

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

// Using R.layout.activity_main from the 'main' source set
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Instead of findViewById<TextView>(R.id.textView)
        textView.setText("Hello, world! \n Hi Aruna")
        textView.setTextColor(Color.RED)
    }
}
