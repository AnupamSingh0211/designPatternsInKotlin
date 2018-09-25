package com.hala.designpatternsinkotlin.Behavioral.Command.RestaurantExample

class Dessert(var name: String) {

    fun order() {
        System.out.println("Dessert" + name + "is ordered");

    }

    fun cancel() {
        System.out.println("Dessert" + name + "is cancelled");

    }

}

//        System.out.println("");