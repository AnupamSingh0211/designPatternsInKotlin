package com.hala.designpatternsinkotlin.Creational.Factory.vehicle


class MotorCycle : Vehicle {
    override fun design() {
        System.out.println("Designing MotorCycle")

    }

    override fun manufacture() {

        System.out.println("Manufacturing MotorCycle")
    }
}