package ru.mingaleev.androidkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstDT = firstDataClass ("Minga", 0)

        findViewById<AppCompatButton>(R.id.btn).setOnClickListener {
            firstDT.clicking()
            Log.d("Test", "${firstDT.name} нажал кнопку ${firstDT.counter.toString()}й раз")
        }
    }

    data class firstDataClass (val name: String, var counter: Int) {
        fun clicking () {
            this.counter += 1
        }
    }
}