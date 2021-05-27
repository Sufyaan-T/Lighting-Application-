package com.example.lightcontrollerapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import com.google.firebase.database.*
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        On.setOnClickListener(){
            lightOn()
        }
        Off.setOnClickListener(){
            lightOff()
        }
    }

    private fun lightOn(){
        var Status = 0
        var database = FirebaseDatabase.getInstance().reference
        database.setValue(Status(1))
    }
    private fun lightOff(){
        var Status = 0
        var database = FirebaseDatabase.getInstance().reference
        database.setValue(Status(0))
    }



}