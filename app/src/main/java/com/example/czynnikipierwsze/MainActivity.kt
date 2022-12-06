//Michał Newlin Łukowicz 2pr

package com.example.czynnikipierwsze

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.rozloz).setOnClickListener {
            var inputLiczba = findViewById<EditText>(R.id.input).getText().toString().toInt()

            var i = 2
            var wynik = mutableListOf<Int>()

            while(inputLiczba > 1){
                while(inputLiczba%i == 0){
                    wynik += i
                    inputLiczba /= i
                }
                i++
            }


            findViewById<TextView>(R.id.textView).text = (wynik.toString())
        }




    }
}