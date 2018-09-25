package com.hala.designpatternsinkotlin.Behavioral.Command.RestaurantExample

class MainDish(var name: String) {

    fun order() {
        System.out.println("Main Dish" + name + "is ordered");

    }

    fun cancel() {
        System.out.println("Main Dish" + name + "is cancelled");

    }

}

//        System.out.println("");