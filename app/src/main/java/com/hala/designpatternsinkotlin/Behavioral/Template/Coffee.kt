package com.hala.designpatternsinkotlin.Behavioral.Template

abstract class Coffee {

    private fun addCoffee() = println("Adding coffee")
    abstract fun addMilk()
    abstract fun addSugar()
    abstract fun addChocolate()
    abstract fun addCream()

    // these methods can be overridden by different types of Coffees(Classes)
    open fun wantsMilk() : Boolean = true
    open fun wantsSugar() : Boolean = true
    open fun wantsChocolate() : Boolean = false
    open fun wantsCream() : Boolean = false

    // template method
    fun brewCoffee() {
        addCoffee()
        if (wantsMilk()) addMilk()
        if (wantsSugar()) addSugar()
        if (wantsChocolate()) addChocolate()
        if (wantsCream()) addCream()
    }

}