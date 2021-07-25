package br.android.viewmodellifecycle

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var nContador = MutableLiveData<String>().apply{value = contador.toString()}
    private var contador: Int = 0

    private fun setnContador(){
        nContador.value = contador.toString()
    }

    private fun validaContador() {
        contador++
        if(contador > 5){
            contador = 0
        }

        setnContador()
    }

    fun Contador(){
        validaContador()
    }
}