package com.hala.designpatternsinkotlin.Creational.Builder

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hala.designpatternsinkotlin.Creational.Builder.builder.ConcreteHouseBuilder
import com.hala.designpatternsinkotlin.Creational.Builder.builder.HouseBuilder
import com.hala.designpatternsinkotlin.Creational.Builder.builder.WoddenHouseBuilder
import com.hala.designpatternsinkotlin.R

class BuilderClientActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activtity_builder)
        runBuildHouseDemo()
    }
    fun runBuildHouseDemo(){

        //concrete house

        var builder: HouseBuilder = ConcreteHouseBuilder()
        var houseBuildDirector = HouseBuildDirector(builder)
        System.out.println(houseBuildDirector.construct())

        // wodden house

         builder = WoddenHouseBuilder()
         houseBuildDirector  = HouseBuildDirector(builder)
        System.out.println(houseBuildDirector.construct())

    }

}