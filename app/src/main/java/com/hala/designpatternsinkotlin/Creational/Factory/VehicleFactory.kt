package com.hala.designpatternsinkotlin.Creational.Factory

import com.hala.designpatternsinkotlin.Creational.Factory.vehicle.Car
import com.hala.designpatternsinkotlin.Creational.Factory.vehicle.MotorCycle
import com.hala.designpatternsinkotlin.Creational.Factory.vehicle.Truck
import com.hala.designpatternsinkotlin.Creational.Factory.vehicle.Vehicle

class VehicleFactory {

    fun getVehicle(vehicleType: String): Vehicle? {
        var vehicle: Vehicle? = null
        when (vehicleType) {
            "car" -> vehicle = Car()
            "truck" ->
                vehicle = Truck()
            "motorcycle" ->
                vehicle = MotorCycle()
            else -> {
            }
        }
        return vehicle
    }

}