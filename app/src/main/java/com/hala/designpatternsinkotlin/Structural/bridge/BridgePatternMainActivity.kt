package com.hala.designpatternsinkotlin.Structural.bridge

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hala.designpatternsinkotlin.R
import com.hala.designpatternsinkotlin.Structural.bridge.DrawingCirclesExample.Circle
import com.hala.designpatternsinkotlin.Structural.bridge.DrawingCirclesExample.GreenCircle
import com.hala.designpatternsinkotlin.Structural.bridge.DrawingCirclesExample.RedCircle
import com.hala.designpatternsinkotlin.Structural.bridge.DrivingCarsExample.runDrivingCarsExample

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-04-09
 */
class BridgePatternMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bridge)
        // drawCirclesDemo()
        runDrivingCarsExample()
    }

    private fun drawCirclesDemo() {

        //Shape class
        val redCircle = Circle(10, 10, 5, RedCircle())
        val greenCircle = Circle(100, 100, 10, GreenCircle())
        redCircle.draw()
        greenCircle.draw()

    }
}