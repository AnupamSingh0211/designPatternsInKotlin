package com.hala.designpatternsinkotlin.Creational.AbstractFactory

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.hala.designpatternsinkotlin.Creational.AbstractFactory.products.Engine
import com.hala.designpatternsinkotlin.Creational.AbstractFactory.products.Tyre
import com.hala.designpatternsinkotlin.R

class AbstractFactoryClient : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        runAbFactoryDemo()
    }

    fun runAbFactoryDemo(){
        //enter the input

        val vehicheType = "car"

        val factory : Factory?
        //Get Factory
        factory = Factory.getFactory(vehicheType)

        //get the engine fromt he factory
        val engine :Engine = factory!!.getEngine();
        engine.design()
        engine.manufacture()
        engine.test()

        val tyre : Tyre = factory.getTrye()
        tyre.design()
        tyre.manufacture()
    }
}