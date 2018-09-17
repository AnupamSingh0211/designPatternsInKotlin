package com.hala.designpatternsinkotlin.Behavioral.Template

class MeatPizza : Pizza() {
    override fun addToppings() {
        System.out.println("Added meat pizza toppings")
    }

    override fun addIngredients() {
        System.out.println("Added meat pizza ingredients")
    }

    fun cook(){
        System.out.println("Cooked for 12 mins")
    }
}