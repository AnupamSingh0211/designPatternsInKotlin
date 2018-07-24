package com.hala.designpatternsinkotlin.Creational.Factory.vehicle


class Truck : Vehicle {
    override fun design() {
        System.out.println("Designing Truck")

    }

    override fun manufacture() {

        System.out.println("Manufacturing Truck")
    }
}