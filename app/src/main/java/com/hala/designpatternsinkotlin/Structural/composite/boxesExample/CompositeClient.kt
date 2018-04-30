package com.hala.designpatternsinkotlin.Structural.composite.boxesExample

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-04-30
 */

class CompositeClient {


    companion object {

        fun main() {

            //initialize products
            val product1: Product = Product(1)
            val product2: Product = Product(2)
            val product3: Product = Product(3)
            val product4: Product = Product(4)

            //initiaize 3 boxes

            val box1: Box = Box(1)
            val box2: Box = Box(2)
            val box3: Box = Box(3)

            //put 3 items in box 1

            box1.addItem(product1)
            box1.addItem(product2)
            box1.addItem(product3)

            //put 1 item in box 2
            box2.addItem(product4)

            //put box inside a box
            box3.addItem(box1)
            box3.addItem(box2)

            //print the contents of box 3
            box3.print(0)

        }
    }

}