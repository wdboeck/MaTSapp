package com.example.wdboeck.matsapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.system.Os.bind
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private var input1: EditText? = null
    private var input2: EditText? = null
    private var input3: EditText? = null

    //internal var currentButton = findViewById<Button>(R.id.button1) as Button
    //var cButton: Button by bind(R.id.button1)   //bind(R.id.button1)
    //var input1 = null

    override fun onCreate(savedInstanceState: Bundle?) {

        //var input1: EditText

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        input1 = findViewById<View>(R.id.editText1) as EditText
        input2 = findViewById<View>(R.id.editText2) as EditText
        input3 = findViewById<View>(R.id.editText3) as EditText


        //input1 = findViewById(R.id.editText1) as EditText
        var currentButton = findViewById<Button>(R.id.button1) as Button
        currentButton.setOnClickListener{

        }
    }



}
