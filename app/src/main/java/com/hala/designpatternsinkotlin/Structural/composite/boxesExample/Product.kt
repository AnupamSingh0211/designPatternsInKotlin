package com.hala.designpatternsinkotlin.Structural.composite.boxesExample

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-04-30
 */
class Product(id: Int) : Item {
    val productId = id
    override fun print(level: Int) {

        for (i in 0..level) {
            print("  ")
            println("Product" + productId)
        }

    }
}