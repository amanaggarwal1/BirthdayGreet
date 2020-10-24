package com.amanaggarwal1.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greet.*

class BirthdayGreetActivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greet)

        val name = intent.getStringExtra(NAME_EXTRA)
        personName.text = "Happy Birthday\n$name!"

    }
}