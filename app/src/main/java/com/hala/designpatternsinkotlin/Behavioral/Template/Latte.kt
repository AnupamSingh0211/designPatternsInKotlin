package com.hala.designpatternsinkotlin.Behavioral.Template

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