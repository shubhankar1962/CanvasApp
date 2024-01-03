package com.example.paintapp

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.paintapp.PaintView.Companion.colorList
import com.example.paintapp.PaintView.Companion.currBrush
import com.example.paintapp.PaintView.Companion.pathList
import com.example.paintapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object{
        var path = Path()
        val paintBrush = Paint()
    }
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.redCircle.setOnClickListener {
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }

        binding.blackCircle.setOnClickListener {
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)
        }

        binding.blueCircle.setOnClickListener {
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)
        }

        binding.greenCircle.setOnClickListener {
            paintBrush.color = Color.GREEN
            currentColor(paintBrush.color)
        }

        binding.whiteCircle.setOnClickListener {
            pathList.clear()
            colorList.clear()
            path.reset()
        }


    }
    private fun currentColor(color:Int){
        currBrush = color
        path = Path()
    }
}