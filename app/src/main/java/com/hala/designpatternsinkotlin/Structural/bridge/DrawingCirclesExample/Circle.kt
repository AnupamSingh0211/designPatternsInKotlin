package com.hala.designpatternsinkotlin.Structural.bridge.DrawingCirclesExample

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-04-09
 */
class Circle(private val x: Int, private val y: Int, private val radius: Int, drawAPI: DrawAPI) : Shape(drawAPI) {

    override fun draw() {
        drawAPI.drawCircle(radius, x, y)
    }
}