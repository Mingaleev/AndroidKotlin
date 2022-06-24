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
        val secondDT = firstDT.copy(name = "Artur", counter = 1)

        findViewById<AppCompatButton>(R.id.btn).setOnClickListener {
            secondDT.clicking()
            Log.d("Test", "${secondDT.name} нажал кнопку ${secondDT.counter.toString()}й раз")
            Log.d("Test", "Результат ${comparison(secondDT.counter)}")
            Log.d("Test --5--", even(secondDT.counter))

        }
    }

    private fun comparison (counter: Int): String {
        return if (counter >= 20) "20 раз или больше" else "меньше 20 раз"
    }

    private fun even (counter: Int): String{
        return when (counter) {
            in 1..4 -> "пока мало"
            5 -> "5 раз!"
            in 6..9 -> "уже нормально"
            10 -> "уже 10 раз!"
            else -> "многовато"
        }
    }

    data class firstDataClass (val name: String, var counter: Int) {
        fun clicking () {
            this.counter += 1
        }
    }
}