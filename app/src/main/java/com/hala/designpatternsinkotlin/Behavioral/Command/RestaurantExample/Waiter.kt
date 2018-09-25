package com.hala.designpatternsinkotlin.Behavioral.Command.RestaurantExample

class Waiter {

    //waiter does not need to know about the details about the command
    fun execute(command: Command) {

        command.execute()
    }


}