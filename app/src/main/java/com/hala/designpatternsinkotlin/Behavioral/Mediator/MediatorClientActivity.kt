package com.hala.designpatternsinkotlin.Behavioral.Mediator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MediatorClientActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mediator)
        runAirTrafficControlDemo()
    }

    fun runAirTrafficControlDemo() {

    }


}