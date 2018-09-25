package com.hala.designpatternsinkotlin.Behavioral.Command.RestaurantExample

class CancelDessert(var item: Dessert) : Command {

    override fun execute() {
        item.cancel()
    }

}