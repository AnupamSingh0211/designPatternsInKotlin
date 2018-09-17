package com.hala.designpatternsinkotlin.Behavioral.Template


abstract  class Pizza {

    fun preparePizza(){
        selectCrust()
        addIngredients()
        addToppings()
        cook()

    }

    private fun cook() {
        System.out.println("Cooked for 10 mins")
    }

     abstract fun addToppings()

    abstract fun addIngredients()

    private fun selectCrust() {

        System.out.println("Selected the default crust")
    }


}