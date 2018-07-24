package com.hala.designpatternsinkotlin.Creational.AbstractFactory.implementation

import com.hala.designpatternsinkotlin.Creational.AbstractFactory.products.Engine



class TruckEngine : Engine {
    override fun design() {
        System.out.println("Designing Truck engine")
    }

    override fun manufacture() {
        System.out.println("Manufacturing Truck engine")
    }

    override fun test() {
        System.out.println("Testing Truck engine")
    }
}