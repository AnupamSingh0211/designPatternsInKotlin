package com.hala.designpatternsinkotlin.Creational.AbstractFactory.factories

import com.hala.designpatternsinkotlin.Creational.AbstractFactory.Factory
import com.hala.designpatternsinkotlin.Creational.AbstractFactory.implementation.CarEngine
import com.hala.designpatternsinkotlin.Creational.AbstractFactory.implementation.CarTyre
import com.hala.designpatternsinkotlin.Creational.AbstractFactory.products.Engine
import com.hala.designpatternsinkotlin.Creational.AbstractFactory.products.Tyre

class CarFactory : Factory() {
    override fun getEngine(): Engine {
        return CarEngine()
    }

    override fun getTrye(): Tyre {
        return CarTyre()
    }
}