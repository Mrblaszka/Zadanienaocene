package com.example.zadanienaocene

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var podaj = findViewById<EditText>(R.id.wejscie)
        var wyswietl = findViewById<TextView>(R.id.wyswietlanie)

        var liczba1 = 0
        var liczba2 = 0
        var suma = 0


        findViewById<Button>(R.id.bnt1).setOnClickListener {
            findViewById<TextView>(R.id.wyswietlanie).text =
                findViewById<EditText>(R.id.wejscie).text

        }

        findViewById<Button>(R.id.suma).setOnClickListener {

            liczba1 = findViewById<TextView>(R.id.liczba1pole).text.toString().toInt()
            liczba2 = findViewById<TextView>(R.id.liczba2pole).text.toString().toInt()

            suma = liczba1 + liczba2
            findViewById<TextView>(R.id.wyswietlanie).text = suma.toString()
        }
        findViewById<Button>(R.id.dopisz).setOnClickListener{
            findViewById<TextView>(R.id.wyswietlanie).text =
                findViewById<TextView>(R.id.wyswietlanie).text.toString() +
                findViewById<EditText>(R.id.wejscie).text.toString()

        }
    }
}