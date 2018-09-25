package com.hala.designpatternsinkotlin.Behavioral.Command.RestaurantExample

class OrderDessert(var item: Dessert) : Command {

    override fun execute() {
        item.order()
    }

}