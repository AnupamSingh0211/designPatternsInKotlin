package com.hala.designpatternsinkotlin.Creational.Builder.builder

import com.hala.designpatternsinkotlin.Creational.Builder.House

interface HouseBuilder{

    fun buildFloor() : HouseBuilder
    fun buildWall() : HouseBuilder
    fun buildRoof() : HouseBuilder
    fun build() : House

}