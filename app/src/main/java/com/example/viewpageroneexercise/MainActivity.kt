package com.example.viewpageroneexercise

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpageroneexercise.controler.PagerAdapter
import com.example.viewpageroneexercise.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewPager.adapter = PagerAdapter(supportFragmentManager)
//        // untuk setup tabLayout nya
//        binding.tabLayoutId.setupWithViewPager(binding.viewPager)
//        // untuk setup warna tulisan di tabLayout nya
//        binding.tabLayoutId.setTabTextColors(Color.GRAY, (Color.parseColor("white")))
        binding.tabLayoutId.apply {
            setupWithViewPager(binding.viewPager)
            setTabTextColors(Color.GRAY, (Color.parseColor("white")))
        }
    }
}