package com.efecanbayat.homework_ui

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SignupActivity: AppCompatActivity() {
    lateinit var backArrow: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        initViews()
        addListeners()

    }

    private fun initViews() {
        backArrow = findViewById(R.id.backArrow)
    }

    private fun addListeners() {
        backArrow.setOnClickListener {
            super.onBackPressed()
        }
    }

}