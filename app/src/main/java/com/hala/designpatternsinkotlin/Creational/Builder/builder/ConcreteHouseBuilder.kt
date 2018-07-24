package com.hala.designpatternsinkotlin.Creational.Builder.builder

import com.hala.designpatternsinkotlin.Creational.Builder.House

class ConcreteHouseBuilder : HouseBuilder {

     var house: House = House()

    override fun buildFloor(): HouseBuilder {
        house.floorType = "concrete"
        return this
    }

    override fun buildWall(): HouseBuilder {
        house.wallType = "concrete"
        return this
    }

    override fun buildRoof(): HouseBuilder {
        house.roofType = "concrete"
        return this
    }

    override fun build(): House {
        return house
    }
}