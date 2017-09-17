package com.oogatta.androidkotlinpoet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.oogatta.annotation.Oogatta

@Oogatta
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
