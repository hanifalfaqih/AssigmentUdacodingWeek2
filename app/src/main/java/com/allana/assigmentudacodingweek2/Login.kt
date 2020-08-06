package com.allana.assigmentudacodingweek2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnLogin: Button
    private lateinit var edtUsername: EditText
    private lateinit var edtPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin = findViewById(R.id.btn_login)
        btnLogin.setOnClickListener(this)

        edtUsername = findViewById(R.id.edt_username)
        edtPassword = findViewById(R.id.edt_password)

    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_login){
            val inputUsername = edtUsername.text.toString()
            val inputPassword = edtPassword.text.toString()

            val username = "hanif"
            val password = "12345"

            var isEmptyFields = false

            if (inputUsername.isEmpty()){
                isEmptyFields = true
                edtUsername.error = "Username tidak boleh kosong"
            }

            if (inputPassword.isEmpty()){
                isEmptyFields = true
                edtPassword.error = "Password tidak boleh kosong"
            }

            if (!isEmptyFields){
                if (inputUsername == username && inputPassword == password){
                    val loginToMain = Intent(this@Login, MainActivity::class.java)
                    startActivity(loginToMain)
                }
            }
        }
    }
}