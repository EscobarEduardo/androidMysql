package com.example.androidmysql2

import android.app.DownloadManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var etId: EditText?=null
    var etNombre: EditText?=null
    var etEmail: EditText?=null
    var etTelefono: EditText?=null
    var etPass: EditText?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNombre = findViewById(R.id.et_nombre)
        etEmail = findViewById(R.id.et_correo)
        etTelefono = findViewById(R.id.et_Telefono)
        etPass = findViewById(R.id.et_pass)
    }
    fun Guardar(vista: View){
//minuto 46
        val url = "http://192.168.56.161/android_mysql2/insertar.php"
        val procesoEnCola:RequestQueue = Volley.newRequestQueue(:this )
        val resultadoPost = object: StringRequest(Request.Method.POST,url,
        Response.Listener<String> { respuesta ->
            Toast.makeText(this, "Usuario insertado exitosamente")

        }
        )
    }
}