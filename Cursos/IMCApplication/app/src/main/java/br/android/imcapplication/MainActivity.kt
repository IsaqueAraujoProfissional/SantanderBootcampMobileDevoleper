package br.android.imcapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListners()
    }

    private fun setListners(){
        alturaEDT?.doAfterTextChanged { text ->
            //Toast.makeText(this, text.toString(), Toast.LENGTH_SHORT).show()
        }
        pesoEDT?.doOnTextChanged{text, _, _, _ ->
            //titleTXT.text = text
        }
        calcularBTN.setOnClickListener {
            calcularIMC(pesoEDT.text.toString(), alturaEDT.text.toString())
        }
    }

    private  fun calcularIMC(peso: String, altura: String){
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()
        if(peso != null && altura != null){
            val imc = peso / (altura * altura)
            titleTXT.text = "Seu IMC é: $imc".format(imc)
        }
    }
}