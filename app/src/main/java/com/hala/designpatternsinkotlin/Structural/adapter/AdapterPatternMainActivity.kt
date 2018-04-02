package com.hala.designpatternsinkotlin.Structural.adapter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hala.designpatternsinkotlin.R
import com.hala.designpatternsinkotlin.Structural.adapter.BirdsExample.BirdAdapter
import com.hala.designpatternsinkotlin.Structural.adapter.BirdsExample.PlasticToyDuck
import com.hala.designpatternsinkotlin.Structural.adapter.BirdsExample.Sparrow


/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-03-26
 */
class AdapterPatternMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adapter)
       showBirdAdapterDemo()
    }

    private fun showBirdAdapterDemo() {

        val sparrow = Sparrow()
        val toyDuck = PlasticToyDuck()
        // Wrap a bird in a birdAdapter so that it
        // behaves like toy duck
        val birdAdapter = BirdAdapter(sparrow)

        println("Sparrow...")
        sparrow.fly()
        sparrow.makeSound()

        println("ToyDuck...")
        toyDuck.squeak()

        // bird behaving like a toy duck
        println("BirdAdapter...")
        birdAdapter.squeak()

    }


}