package com.example.textinputviewmodeldemo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//clase que extiende del componente viewmodel
class MainViewModel : ViewModel() {

    //propiedad que define el estado del texto inicializado a estado vacio
    val texFieldState = MutableLiveData("")
    //metodo publico que cuando cambie el texto se modifique el estado
    fun onTextField(newText: String){
        texFieldState.value = newText
    }
}