package com.hala.designpatternsinkotlin.Behavioral.Template

class Espresso : Coffee() {

    override fun addMilk() {}

    override fun addSugar() {}

    override fun addChocolate() {}

    override fun addCream() {}


    override fun wantsMilk(): Boolean = false
    override fun wantsSugar(): Boolean = false
}