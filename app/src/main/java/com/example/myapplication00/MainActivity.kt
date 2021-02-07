package com.example.myapplication00

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val miss = Toast.makeText(applicationContext,"Some field is blank.",Toast.LENGTH_LONG)
        val num2 = Toast.makeText(applicationContext,"Num 2 Shouldn't be blank or be 0.",Toast.LENGTH_LONG)
        val clear = Toast.makeText(applicationContext,"All fields are cleared.",Toast.LENGTH_LONG)
//        val a = MainNum.getText().toString().toDouble()
//        val b = SubNum.getText().toString().toDouble()  //ถ้าใส่ตรงนี้แอพจะเด้งเนื่องจากไม่สามรถ get ค่า Main , sub ได้(มั้ง)
        var res:Double

        plus1.setOnClickListener(){
            if (this.Number1.text.toString() == "" || this.Number2.text.toString() == ""){
                miss.show()
            }else{
                val a = Number1.getText().toString().toDouble()
                val b = Number2.getText().toString().toDouble()
                i.setText("+")
                res = a + b
                Number3.setText("$res")
            }
        }
        minus1.setOnClickListener(){
            if (this.Number1.text.toString() == "" || this.Number2.text.toString() == ""){
                miss.show()
            }else{
                val a = Number1.getText().toString().toDouble()
                val b = Number2.getText().toString().toDouble()
                i.setText("-")
                res = a - b
                Number3.setText("$res")
            }
        }
        miutiply1.setOnClickListener(){
            if (this.Number1.text.toString() == "" || this.Number2.text.toString() == ""){
                miss.show()
            }else{
                val a = Number1.getText().toString().toDouble()
                val b = Number2.getText().toString().toDouble()
                i.setText("*")
                res = a * b
                Number3.setText("$res")
            }
        }
        divider1.setOnClickListener(){
            if (this.Number1.text.toString() == "" || this.Number2.text.toString() == ""){
                miss.show()
            }else{
                val a = Number1.getText().toString().toDouble()
                val b = Number2.getText().toString().toDouble()
                i.setText("/")
                res = a / b
                Number3.setText("$res")
            }
        }
        modulo1.setOnClickListener(){
            if (this.Number1.text.toString() == "" || this.Number2.text.toString() == "0"){
                num2.show()
            }else{
                val a = Number1.getText().toString().toDouble()
                val b = Number2.getText().toString().toDouble()
                i.setText("%")
                res = a % b
                Number3.setText("$res")
            }
        }
        clear1.setOnClickListener(){
            Number1.setText(null)
            Number2.setText(null)
            i.setText(null)
            Number3.setText(null)
            clear.show()
        }
    }
}

