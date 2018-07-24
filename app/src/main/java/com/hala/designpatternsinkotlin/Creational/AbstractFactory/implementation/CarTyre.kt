package com.hala.designpatternsinkotlin.Creational.AbstractFactory.implementation

import com.hala.designpatternsinkotlin.Creational.AbstractFactory.products.Tyre

class CarTyre : Tyre {
    override fun design() {

        System.out.println("Designing car tyre")
    }


    override fun manufacture() {

        System.out.println("Manufacturing car tyre")
    }
}