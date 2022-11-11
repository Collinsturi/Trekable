package com.rsk.trekable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.tabs.TabLayoutMediator
import com.rsk.trekable.databinding.ContentActivityMainScreenBinding
import com.rsk.trekable.viewmodel.ViewModel

class MainScreenActivity : AppCompatActivity() {
    private lateinit var binding: ContentActivityMainScreenBinding

    private lateinit var viewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ContentActivityMainScreenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        viewModel = ViewModelProvider(this).get(ViewModel::class.java)

        val adapter = PagerAdapter(viewModel.images)

        binding.viewPagerbalicities.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPagerbalicities){tab, position ->
            tab.text = viewModel.cityNames[position]

        }
    }
}