package com.example.booking.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.booking.R

class MainActivity : AppCompatActivity() {

    lateinit var edt_username: EditText
    lateinit var edt_password: EditText
    lateinit var btn_login: Button
    val username: String = "mohamed"
    val pass: String = "123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edt_username = findViewById(R.id.edt_username)
        edt_password = findViewById(R.id.edt_password)
        btn_login = findViewById(R.id.btn_login)


        btn_login.setOnClickListener {
            if (!edt_username.text.toString().isNullOrEmpty() && !edt_password.text.toString()
                    .isNullOrEmpty()
            ) {
                if (edt_username.text.toString().equals(username) && edt_password.text.toString()
                        .equals(pass)
                ) {
                    Toast.makeText(this, "login Successfully", Toast.LENGTH_SHORT).show()
                    var intent: Intent = Intent(this, SecondActivty::class.java)
                    intent.putExtra("UserName ", edt_username.text.toString())
                    intent.putExtra("passowrd ", edt_password.text.toString())

                    startActivity(intent)
                }

            }


            //               Toast.makeText(this, "login Successfully", Toast.LENGTH_SHORT).show()
        }

    }

    fun onclicklogin(view: android.view.View) {}


}