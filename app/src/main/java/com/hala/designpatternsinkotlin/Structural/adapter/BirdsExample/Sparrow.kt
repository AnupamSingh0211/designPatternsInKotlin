package com.hala.designpatternsinkotlin.Structural.adapter.BirdsExample

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-04-02
 */
internal class Sparrow : Bird {
    // a concrete implementation of bird
    override fun fly() {
        println("Flying")
    }

    override fun makeSound() {
        println("Chirp Chirp")
    }
}