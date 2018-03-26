package com.hala.designpatternsinkotlin.Structural.proxy.ImageExample

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-03-26
 */
class ProxyPatternDemo {

    fun main() {
        val image = ProxyImage("test_10mb.jpg")

        //image will be loaded from disk
        image.display()
        println("")

        //image will not be loaded from disk
        image.display()
    }
}