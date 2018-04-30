package com.hala.designpatternsinkotlin.Structural.flyweight.gameTrafficVehicleExample


import java.util.*

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-04-30
 */

class TrafficGameClient {
    companion object {

        var random: Random = Random()
        private val colors = arrayOf("Red", "Green", "Blue", "White", "Black")
        private val types = arrayOf("bus", "truck", "car", "bike")
        private val speeds: Int
            get() = (Math.random() * 100).toInt()

        fun main() {

            val vehicleFactory: VehicleFactory = VehicleFactory()
            var i = 0
            while (i < 19) {
                var vehicle: Vehicle? = vehicleFactory.getVehicle(types[random.nextInt(types.size)], colors[random.nextInt(colors.size)], speeds, random.nextInt(5) + 1)

                if (vehicle != null) {
                    println("Vehicle " + (i + 1))
                    vehicle.addToTraffic()
                } else {
                    //all objects are in use wait and try again
                    println("all objects are in use wait and try again")
                    i--
                    Thread.sleep(2000)

                }
            }


        }

    }


}