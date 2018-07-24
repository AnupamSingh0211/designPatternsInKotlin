package com.hala.designpatternsinkotlin.Creational.AbstractFactory.factories

import com.hala.designpatternsinkotlin.Creational.AbstractFactory.Factory
import com.hala.designpatternsinkotlin.Creational.AbstractFactory.implementation.TruckEngine
import com.hala.designpatternsinkotlin.Creational.AbstractFactory.implementation.TruckTyre
import com.hala.designpatternsinkotlin.Creational.AbstractFactory.products.Engine
import com.hala.designpatternsinkotlin.Creational.AbstractFactory.products.Tyre


class TruckFactory : Factory() {
    override fun getEngine(): Engine {
        return TruckEngine()
    }

    override fun getTrye(): Tyre {
        return TruckTyre()
    }
}