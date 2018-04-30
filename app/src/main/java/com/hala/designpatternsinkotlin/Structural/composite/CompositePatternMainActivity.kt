package com.hala.designpatternsinkotlin.Structural.composite

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.hala.designpatternsinkotlin.R
import com.hala.designpatternsinkotlin.Structural.composite.boxesExample.CompositeClient
import com.hala.designpatternsinkotlin.Structural.flyweight.circleExample.ShapeClient
import com.hala.designpatternsinkotlin.Structural.flyweight.gameTrafficVehicleExample.TrafficGameClient

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-04-27
 */

class CompositePatternMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_composite)
        runBoxesDemo()
    }

    private fun runBoxesDemo() {

        CompositeClient.main()
    }

}