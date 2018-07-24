package com.hala.designpatternsinkotlin.Creational.Builder

import com.hala.designpatternsinkotlin.Creational.Builder.builder.HouseBuilder

class HouseBuildDirector(val builder: HouseBuilder) {

    fun construct(): House {

        return builder.buildFloor().buildWall().buildRoof().build();

    }


}