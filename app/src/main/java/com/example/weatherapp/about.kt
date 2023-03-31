package com.example.weatherapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import java.net.URI
import java.net.URL

class about : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        findViewById<TextView>(R.id.email_id).setOnClickListener {

            var emailo = Intent(Intent.ACTION_SENDTO
            ,Uri.fromParts("mmt","mimounimohammedtayeb@gmail.com","null"))
            startActivity(Intent.createChooser(emailo,"send email ..."))
        }




         findViewById<ImageView>(R.id.back_id).setOnClickListener {
             val intent = Intent(this,MainActivity::class.java)
                 startActivity(intent)

         }

    }
}