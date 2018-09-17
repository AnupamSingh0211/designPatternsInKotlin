package com.hala.designpatternsinkotlin.Behavioral.Template.CoffeeExample

class Latte : Coffee() {

    override fun addMilk() {
        println("Adding a lot of Milk")
    }

    override fun addSugar() {
        println("Adding Sugar")
    }

    override fun addChocolate() {}

    override fun addCream() {}
}