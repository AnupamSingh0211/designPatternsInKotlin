package com.hala.designpatternsinkotlin.Structural.decorator.ShapeDecorationExample

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-04-09
 */

class RedShapeDecorator(decoratedShape: Shape) : ShapeDecorator(decoratedShape) {

    override fun draw() {
        decoratedShape.draw()
        setRedBorder(decoratedShape)
    }

    private fun setRedBorder(decoratedShape: Shape) {
        println("Border Color: Red")
    }
}