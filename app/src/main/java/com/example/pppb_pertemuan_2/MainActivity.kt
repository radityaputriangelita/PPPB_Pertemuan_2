package com.example.pppb_pertemuan_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pppb_pertemuan_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var number = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            YES.setOnClickListener{
                Toast.makeText(this@MainActivity, "Hello " + textname.text,Toast.LENGTH_SHORT).show()
            }
        }
    }
}