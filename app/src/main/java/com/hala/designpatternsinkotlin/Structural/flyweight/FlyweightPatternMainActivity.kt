package com.hala.designpatternsinkotlin.Structural.flyweight

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hala.designpatternsinkotlin.R
import com.hala.designpatternsinkotlin.Structural.flyweight.circleExample.FlyweightPatternDemo

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-04-27
 */

class FlyweightPatternMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adapter)
         showShapeDemo()

    }

    private fun showShapeDemo() {
     FlyweightPatternDemo.main()

    }
}