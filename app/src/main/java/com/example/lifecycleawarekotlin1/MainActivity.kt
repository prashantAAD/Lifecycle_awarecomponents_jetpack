package com.example.lifecycleawarekotlin1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LifecycleOwner

class MainActivity : AppCompatActivity(),LifecycleOwner {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(Observer())
       // myLifeCycleOwner.lifecycle.addObserver(Observer())//add Observer in main activity so that main activity code will be less.we can have more observers and write code accordingly.
        Log.d("main", "activity onCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.d("main", "activity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("main", "activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("main", "activity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("main", "activity onDestroy")
    }
}