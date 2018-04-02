package com.hala.designpatternsinkotlin.Structural.adapter.BirdsExample

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-04-02
 * // You need to implement the interface your
 */ // client expects to use.
internal class BirdAdapter(var bird: Bird) : ToyDuck {
    // we need reference to the object we are adapting
    override fun squeak() {
        // translate the methods appropriately
        bird.makeSound()
    }
}