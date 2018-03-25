package com.hala.designpatternsinkotlin.Structural.facade.ShapeMakerSample.shapemakersinternalsystem

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-03-25
 */
class Square : Shape {
    override fun onDraw() {
        println("Square::draw()")
    }
}