package com.example.tweenanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var buttonSpin: Button
    private lateinit var buttonBlink: Button
    private lateinit var buttonZoom: Button
    private lateinit var buttonMove : Button
    private lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonSpin = findViewById(R.id.buttonSpin)
        buttonBlink = findViewById(R.id.buttonBlink)
        buttonZoom = findViewById(R.id.buttonZoom)
        buttonMove = findViewById(R.id.buttonMove)
        imageView = findViewById(R.id.imageView)
        buttonSpin.setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this,R.anim.spin)
            imageView.startAnimation(anim)
        }
        buttonBlink.setOnClickListener {
            val an = AnimationUtils.loadAnimation(this,R.anim.blink)
            imageView.startAnimation(an)
        }
        buttonZoom.setOnClickListener {
            val a = AnimationUtils.loadAnimation(this,R.anim.zoom)
            imageView.startAnimation(a)
        }
        buttonMove.setOnClickListener {
            val z = AnimationUtils.loadAnimation(this, R.anim.move)
            imageView.startAnimation(z)
        }
        }

    }


