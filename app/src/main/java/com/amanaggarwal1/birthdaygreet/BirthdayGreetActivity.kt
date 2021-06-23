package com.amanaggarwal1.birthdaygreet

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_birthday_greet.*
import java.util.*

class BirthdayGreetActivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }

    private var greet = "Happy birthday"

    private val textToSpeechEngine: TextToSpeech by lazy {
        TextToSpeech(this,
            TextToSpeech.OnInitListener { status ->
                if (status == TextToSpeech.SUCCESS) {
                    textToSpeechEngine.language = Locale.UK
                }
            })
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greet)

        val name = intent.getStringExtra(NAME_EXTRA)
        personName.text = "$greet\n$name!"
        greet += " $name"
    }

    fun readOutGreeting(view: View) {
        val text = greet.trim()
        if (text.isNotEmpty()) {
                textToSpeechEngine.speak(text, TextToSpeech.QUEUE_FLUSH, null, "tts1")
        } else {
            Toast.makeText(this, "Text cannot be empty", Toast.LENGTH_LONG).show()
        }
    }


}