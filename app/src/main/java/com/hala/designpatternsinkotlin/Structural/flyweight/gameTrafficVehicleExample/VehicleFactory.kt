package com.hala.designpatternsinkotlin.Structural.flyweight.gameTrafficVehicleExample

import java.util.*

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-04-30
 */
public class VehicleFactory {

    var pool: Vector<Vehicle> = Vector()

    init {
        for (i in 0..5) {
            // create new  vehicle and add them to the pool
            pool.add(Vehicle("v" + (i + 1)))
        }
    }

    public fun getVehicle(type: String, color: String, speed: Int, duration: Int): Vehicle? {
        for (veh in pool) {
            if (!veh.active) {
                //set the extrinsic properties
                veh.setProperties(type, color, speed, duration)
                return veh;
            }
        }
        return null
    }

}
