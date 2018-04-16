package com.hala.designpatternsinkotlin.Structural.decorator.ShapeDecorationExample

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-04-09
 */

abstract class ShapeDecorator(protected var decoratedShape: Shape) : Shape {

    override fun draw() {
        decoratedShape.draw()
    }
}
