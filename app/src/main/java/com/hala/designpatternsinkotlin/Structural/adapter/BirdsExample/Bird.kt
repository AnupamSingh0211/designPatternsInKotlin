package com.hala.designpatternsinkotlin.Structural.adapter.BirdsExample

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-04-02
 */
internal interface Bird {
    // birds implement Bird interface that allows
    // them to fly and make sounds adaptee interface
    fun fly()

    fun makeSound()
}