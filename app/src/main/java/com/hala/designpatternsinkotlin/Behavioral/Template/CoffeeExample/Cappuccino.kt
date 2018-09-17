package com.hala.designpatternsinkotlin.Behavioral.Template.CoffeeExample

class Cappuccino : Coffee() {

    override fun addMilk() {
        println("Adding little bit of Milk")
    }

    override fun addSugar() {
        println("Adding Sugar")
    }

    override fun addChocolate() {}

    override fun addCream() {}
}