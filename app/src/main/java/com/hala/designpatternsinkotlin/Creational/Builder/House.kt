package com.hala.designpatternsinkotlin.Creational.Builder

class House
{
    lateinit var floorType : String
    lateinit var wallType : String
    lateinit var roofType : String

    public override fun toString(): String {
        return "Constructing a new house"+ "  FloorType : "+ floorType + "  Wall Type :" + wallType + "  roofType: "+ roofType;
    }

}