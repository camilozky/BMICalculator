package com.example.bmicalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_show_bmi.*

class ShowBMIActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_bmi)
        textViewBMI.text = intent.getStringExtra("BMI")
        imageViewShare.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(
                Intent.EXTRA_TEXT,
                "This is my BMI: " + intent.getStringExtra("BMI")
            )
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "This is my BMI: ")
            startActivity(shareIntent)
        }
    }
}
