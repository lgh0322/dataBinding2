package com.viatom.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.viatom.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b:ActivityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        val sc:Score=ViewModelProvider(this).get(Score::class.java);
        b.core=sc
        b.lifecycleOwner=this
    }
}