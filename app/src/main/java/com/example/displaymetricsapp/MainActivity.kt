package com.example.displaymetricsapp

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.util.DisplayMetrics
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        if (getResources (). getBoolean (R.bool. portrait_only )) {
            setRequestedOrientation (ActivityInfo. SCREEN_ORIENTATION_UNSPECIFIED );
        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // get device dimensions
        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        var width = displayMetrics.widthPixels
        var height = displayMetrics.heightPixels
        textV.text = width.toString() + " x " +height.toString()
    }
}