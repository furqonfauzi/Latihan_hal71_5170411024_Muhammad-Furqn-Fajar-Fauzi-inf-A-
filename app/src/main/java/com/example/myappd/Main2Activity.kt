package com.example.myappd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent=intent
        val Nama=intent.getStringExtra("Nama")
        val Nim=intent.getStringExtra("Nim")
        val Nilai=intent.getIntExtra("Nilai",0)


        val keteranga:String

        if (Nilai>=80){
            keteranga="Keterangan : IPK Anda ( A ) "
        }
        else if (Nilai>=60){
            keteranga="Keterangan : IPK Anda ( B ) "
        }
        else if (Nilai>=40){
            keteranga="Keterangan : IPK Anda ( C ) "
        }
        else if (Nilai>=20){
            keteranga="Keterangan : IPK Anda ( D ) "
        }
        else {
            keteranga="Keterangan : IPK Anda ( E ) "
        }
        val hasil=findViewById<TextView>(R.id.out_nilai)
        hasil.text="Nama : "+Nama+"\nNim : "+Nim+"\nNilai Angka : "+Nilai+"\n"+keteranga
    }
}
