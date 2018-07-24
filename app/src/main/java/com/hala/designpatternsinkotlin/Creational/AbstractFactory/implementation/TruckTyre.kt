package com.hala.designpatternsinkotlin.Creational.AbstractFactory.implementation

import com.hala.designpatternsinkotlin.Creational.AbstractFactory.products.Tyre


class TruckTyre : Tyre {
    override fun design() {

        System.out.println("Designing Truck tyre")
    }


    override fun manufacture() {

        System.out.println("Manufacturing Truck tyre")
    }
}