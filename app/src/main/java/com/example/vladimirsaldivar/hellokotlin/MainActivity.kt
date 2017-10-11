package com.example.vladimirsaldivar.hellokotlin

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.vladimirsaldivar.hellokotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val user = DataBindingKotlinModel("DATA BINDING", "Spartdark")
        binding.setVariable(BR.model, user)
        binding.executePendingBindings()
    }
}
