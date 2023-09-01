package com.example.app.practica.proyectofinal.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.app.practica.proyectofinal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel.result.observe(this){
            binding.result.text = "${it.resultado}"
        }

        binding.button.setOnClickListener {

            if(binding.primero.text.length == binding.segundo.text.length){
                mainViewModel.igual()
            }
            else{
                mainViewModel.notigual()
            }
        }
    }
}