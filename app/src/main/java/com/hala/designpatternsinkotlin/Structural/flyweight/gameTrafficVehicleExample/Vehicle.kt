package com.hala.designpatternsinkotlin.Structural.flyweight.gameTrafficVehicleExample

import android.os.Handler

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-04-30
 */

class Vehicle(name: String) {

    var name: String
    lateinit var task: String
    lateinit var type: String
    lateinit var color: String
    var speed: Int = -1
    var active: Boolean = false
        get() = field
    var duration: Int = -1

    init {
        this.name = name
    }

    public fun setProperties(type: String, color: String, speed: Int, duration: Int) {
        this.type = type
        this.color = color
        this.speed = speed
        this.duration = duration
    }

    public fun addToTraffic() {
        println(" Name :" + name + "  Type :" + type + "-" + color
                + "-" + speed + "mph-" + duration + "seconds")

        // adding a timer to  wait then take a vehicle out of the traffic

        Handler().postDelayed({

            active = false
            println(name + "-->> Out")

        }, 2000)

        active = true
    }


}