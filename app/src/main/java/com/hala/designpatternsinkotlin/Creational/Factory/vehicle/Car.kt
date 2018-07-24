package com.hala.designpatternsinkotlin.Creational.Factory.vehicle

class Car : Vehicle {
    override fun design() {
        System.out.println("Designing Car")

    }

    override fun manufacture() {

        System.out.println("Manufacturing Car")
    }
}