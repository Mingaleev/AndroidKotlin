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

        val firstDT = firstDataClass ("Minga")
        findViewById<AppCompatButton>(R.id.btn).setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                firstDT.clicking()
                Log.d("Test", "Minga нажал кнопку ${firstDT.counter.toString()}й раз")
            }
        })
    }

    data class firstDataClass (var name: String) {
        var counter = 0

        fun clicking () {
            this.counter += 1
        }
    }
}