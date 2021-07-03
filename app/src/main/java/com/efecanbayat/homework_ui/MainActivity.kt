package com.efecanbayat.homework_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.progressindicator.CircularProgressIndicator
import me.relex.circleindicator.CircleIndicator3

class MainActivity : AppCompatActivity() {

    lateinit var button: AppCompatButton
    lateinit var viewPager2: ViewPager2
    lateinit var indicator: CircleIndicator3
    private var imagesList = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewpager)

        initViews()
        addListeners()
        postToList()
        viewPager2.adapter = ViewPagerAdapter(imagesList)
        viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        indicator.setViewPager(viewPager2)
    }

    private fun addListeners() {
        button.setOnClickListener {
            navigateToSignup()
        }
    }

    private fun navigateToSignup() {
        val intent = Intent(this,SignupActivity::class.java)
        startActivity(intent)
    }

    private fun addToList(image: Int){
        imagesList.add(image)
    }

    private fun postToList() {
        addToList(R.drawable.img_pool)
        addToList(R.drawable.img_pool2)
        addToList(R.drawable.img_pool3)
        addToList(R.drawable.img_pool4)

    }



    private fun initViews() {
        viewPager2 = findViewById(R.id.viewPager2)
        indicator = findViewById(R.id.indicator)
        button = findViewById(R.id.button)
    }
}