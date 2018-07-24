package com.hala.designpatternsinkotlin.Creational.Factory

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hala.designpatternsinkotlin.Creational.Factory.vehicle.Vehicle
import com.hala.designpatternsinkotlin.R

class FactoryClient : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factory)
        runFactoryDemo()
    }

    fun runFactoryDemo(){
        val vehicleType  = "motorcycle"
        val factory = VehicleFactory()

        val vehicle: Vehicle = factory.getVehicle(vehicleType)!!
        vehicle.design()
        vehicle.manufacture()



    }


}