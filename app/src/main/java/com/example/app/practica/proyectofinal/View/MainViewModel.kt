package com.example.app.practica.proyectofinal.View


import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import com.example.app.practica.proyectofinal.Model.Compare


class MainViewModel: ViewModel() {

    val result: LiveData<Compare> get() = _result
    private var _result = MutableLiveData<Compare>(Compare(String()))

    fun igual(){
        val next = _result
        updateResult("It´s the same text :D")
    }
    fun notigual(){
        val next = _result
        updateResult("Not the same :(")
    }
    private fun updateResult(next: String){
        _result.value = Compare(next)
    }

}