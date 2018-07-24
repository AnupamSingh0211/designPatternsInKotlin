package com.hala.designpatternsinkotlin.Creational.AbstractFactory

import com.hala.designpatternsinkotlin.Creational.AbstractFactory.factories.CarFactory
import com.hala.designpatternsinkotlin.Creational.AbstractFactory.factories.TruckFactory
import com.hala.designpatternsinkotlin.Creational.AbstractFactory.products.Engine
import com.hala.designpatternsinkotlin.Creational.AbstractFactory.products.Tyre

public abstract class Factory {

    public abstract fun getEngine(): Engine
    public abstract fun getTrye(): Tyre
    /// factory method exposed to the client
    //client requests for a factory by passing the tyep
    //client has no clue of object creation internally

   companion object {
       private var carFactory: Factory? = null
       private var truckFactory: Factory? = null

       public fun getFactory(vehicleType: String): Factory? {

           var factory: Factory? = null
           when (vehicleType) {
               "car" -> {
                   if (carFactory == null)
                       carFactory = CarFactory()
                   factory = carFactory

               }
               "truck" -> {

                   if (truckFactory == null)
                       truckFactory = TruckFactory()
                   factory = truckFactory

               }
               else -> {
                   return null;
               }

           }

           return factory
       }

   }

}