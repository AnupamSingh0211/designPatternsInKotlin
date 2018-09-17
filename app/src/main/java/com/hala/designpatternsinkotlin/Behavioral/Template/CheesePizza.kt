package com.hala.designpatternsinkotlin.Behavioral.Template

class CheesePizza : Pizza() {
    override fun addToppings() {
        System.out.println("Added CheesePizza toppings")
    }

    override fun addIngredients() {
        System.out.println("Added CheesePizza  ingredients")
    }

    fun cook(){
        System.out.println("Cooked for 8 mins")
    }
}