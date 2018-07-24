package com.hala.designpatternsinkotlin.Creational.AbstractFactory.implementation

import com.hala.designpatternsinkotlin.Creational.AbstractFactory.products.Engine

class CarEngine : Engine {
    override fun design() {
        System.out.println("Designing Car engine")
    }

    override fun manufacture() {
        System.out.println("Manufacturing Car engine")
    }

    override fun test() {
        System.out.println("Testing Car engine")
    }
}