package com.amanaggarwal1.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createCard(view: View) {
        val name = personNameET.editableText.toString()

        if(name.isEmpty()){
            Toast.makeText(this, "Please enter a name", Toast.LENGTH_SHORT).show()
            return
        }
        intent = Intent(this, BirthdayGreetActivity::class.java)
        intent.putExtra(BirthdayGreetActivity.NAME_EXTRA , name)
        startActivity(intent)
    }
}