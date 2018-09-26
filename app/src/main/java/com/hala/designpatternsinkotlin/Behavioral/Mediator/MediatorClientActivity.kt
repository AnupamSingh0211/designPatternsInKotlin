package com.hala.designpatternsinkotlin.Behavioral.Mediator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hala.designpatternsinkotlin.Behavioral.Mediator.AirTrafficMediatorExample.*
import com.hala.designpatternsinkotlin.R

class MediatorClientActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mediator)
        runAirTrafficControlDemo()
    }

    fun runAirTrafficControlDemo() {

        var atcMediator: ATCMediator = ATCMediatorImpl()
        //create a runnwat and register it
        atcMediator.registerRunway(Runway("RW-ONE", false))

        //create gates
        atcMediator.registerGate(Gate("Gate 1", false));
        atcMediator.registerGate(Gate("Gate 2", false));
        atcMediator.registerGate(Gate("Gate 3", false));

        // may flight are in now
        // they all want to land or take off
        //they talk the mediator instead of Runwat or gate objects
        for (flightIndex in 1..10) {
            var flight = Flight(atcMediator, "F 00122" + flightIndex + 1)
            flight.landAndTakeOff()

        }

    }


}