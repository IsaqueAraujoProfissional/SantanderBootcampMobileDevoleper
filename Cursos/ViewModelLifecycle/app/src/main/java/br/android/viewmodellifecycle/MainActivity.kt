package br.android.viewmodellifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var txtNome: EditText
    lateinit var btnDados: Button
    lateinit var btnMostrar: Button

    lateinit var mViewModel: MainViewModel

    var contador: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //logar(valor = "onCreate")

        initDados()
        //initContador()
        initClick()

        //validaContador()

        //finalizarApp()
    }

    private fun finalizarApp() {
        finish()
    }

    /*override fun onStart() {
        logar(valor = "onStart")
        super.onStart()
    }

    override fun onResume() {
        logar(valor = "onResume")
        super.onResume()
    }

    override fun onPause() {
        logar(valor = "onPause")
        super.onPause()
    }

    override fun onStop() {
        logar(valor = "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        logar(valor = "onDestroy")
        super.onDestroy()
    }

    private fun logar(tag: String = "Ciclo de Vida", valor: String){
        Log.d(tag, valor)
    }*/
    private fun validaContador() {
        if(contador > 5){
            contador = 0
        }
    }

    private fun initClick() {
        btnDados.setOnClickListener {
            mViewModel.Contador()
            //contador++
            //validaContador()
            //initContador()
        }
        btnMostrar.setOnClickListener {
            Toast.makeText(applicationContext, "Valor Contador: ${mViewModel.nContador.value}", Toast.LENGTH_SHORT).show()
        }
    }

    private fun initContador() {
        txtNome.setText(contador.toString())
    }

    private fun initDados() {
        mViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        txtNome = findViewById(R.id.contador)
        btnDados = findViewById(R.id.btnDados)
        btnMostrar = findViewById(R.id.btnMostrar)

        mViewModel.nContador.observe(this, Observer {
            valor -> txtNome.setText(valor)
        })
    }
}