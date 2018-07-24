package com.hala.designpatternsinkotlin.Creational.Singleton

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hala.designpatternsinkotlin.R

class SingletonDemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actvity_singleton)
        runSingleTonDemo()
    }

    fun runSingleTonDemo() {
        val obj1: Singleton = Singleton.getInstanc()!!
        obj1.printObjectId()

        val obj2: Singleton = Singleton.getInstanc()!!
        obj2.printObjectId()

    }
}