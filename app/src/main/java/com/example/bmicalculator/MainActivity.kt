package com.example.bmicalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonCalculate.setOnClickListener {
            val intent = Intent(this@MainActivity, ShowBMIActivity::class.java)
            intent.putExtra("BMI", getBMI())
            startActivity(intent)
        }
    }

    private fun getBMI(): String {
        val height: Double = editTextHeight.text.toString().toDouble()
        val weight: Double = editTextWeight.text.toString().toDouble()
        return "BMI for adults: " + weight / height.pow(2)
    }

}