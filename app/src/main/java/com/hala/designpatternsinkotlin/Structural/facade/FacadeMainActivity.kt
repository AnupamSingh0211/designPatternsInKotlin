package com.hala.designpatternsinkotlin.Structural.facade

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hala.designpatternsinkotlin.R
import com.hala.designpatternsinkotlin.Structural.facade.ShapeMakerSample.ShapeMakerFacadeClient
import com.hala.designpatternsinkotlin.Structural.facade.BankSystemExample.BankSystemFacadeClient

class FacadeMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facade)
        // shapeMakerDemo()
        bankSystemDemo()

    }

    private fun bankSystemDemo() {
        val bankDemo = BankSystemFacadeClient()
        bankDemo.main()

    }

    private fun shapeMakerDemo() {

        val demo = ShapeMakerFacadeClient()
        demo.main()
    }
}
