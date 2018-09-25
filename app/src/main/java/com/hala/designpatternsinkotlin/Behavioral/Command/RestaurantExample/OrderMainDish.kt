package com.hala.designpatternsinkotlin.Behavioral.Command.RestaurantExample

class OrderMainDish(var item: MainDish) : Command {

    override fun execute() {
        item.order()
    }

}