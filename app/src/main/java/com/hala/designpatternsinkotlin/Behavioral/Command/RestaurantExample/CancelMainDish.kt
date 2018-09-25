package com.hala.designpatternsinkotlin.Behavioral.Command.RestaurantExample

class CancelMainDish(var item: MainDish) : Command {

    override fun execute() {
        item.cancel()
    }

}