package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOne.setOnClickListener {
            if (numOne.text.equals("") || numTwo.text.equals("")) {
                Toast.makeText(
                    applicationContext,
                    "Please Fill numbers!!",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                var a:Double = numOne.text.toString().toDouble()
                var b:Double = numTwo.text.toString().toDouble()
                var c:Double
                c=a+b
                textTwo.text=c.toString()
            }
        }

        btnTwo.setOnClickListener {
            if (numOne.text.equals("") || numTwo.text.equals("")) {
                Toast.makeText(
                    applicationContext,
                    "Please Fill numbers!!",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                var a:Double = numOne.text.toString().toDouble()
                var b:Double = numTwo.text.toString().toDouble()
                var c:Double
                c=a-b
                textTwo.text=c.toString()
            }
        }

        btnThree.setOnClickListener {
            if (numOne.text.equals("") || numTwo.text.equals("")) {
                Toast.makeText(
                    applicationContext,
                    "Please Fill numbers!!",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                var a:Double = numOne.text.toString().toDouble()
                var b:Double = numTwo.text.toString().toDouble()
                var c:Double
                c=a*b
                textTwo.text=c.toString()
            }
        }

        btnFour.setOnClickListener {
            if (numOne.text.equals("") || numTwo.text.equals("")) {
                Toast.makeText(
                    applicationContext,
                    "Please Fill numbers!!",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                var a:Double = numOne.text.toString().toDouble()
                var b:Double = numTwo.text.toString().toDouble()
                var c:Double
                c=a/b
                textTwo.text=c.toString()
            }
        }

        btnFive.setOnClickListener {
            if (numOne.text.equals("") || numTwo.text.equals("")) {
                Toast.makeText(
                    applicationContext,
                    "Please Fill numbers!!",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                var a:Double = numOne.text.toString().toDouble()
                var b:Double = numTwo.text.toString().toDouble()
                var c:Double
                c=a/b
                textTwo.text=c.toString()
            }
        }

        btnSix.setOnClickListener {
            numOne.setText("")
            numTwo.setText("")
            textTwo.setText("0")
        }
    }
}
