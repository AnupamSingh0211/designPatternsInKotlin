package com.hala.designpatternsinkotlin.Creational.Builder.builder

import com.hala.designpatternsinkotlin.Creational.Builder.House


class WoddenHouseBuilder : HouseBuilder {


     var house: House = House()

    override fun buildFloor(): HouseBuilder {
        house.floorType = "wodden"
        return this
    }

    override fun buildWall(): HouseBuilder {
        house.wallType = "wodden"
        return this
    }

    override fun buildRoof(): HouseBuilder {
        house.roofType = "wodden"
        return this
    }

    override fun build(): House {
        return house
    }
}