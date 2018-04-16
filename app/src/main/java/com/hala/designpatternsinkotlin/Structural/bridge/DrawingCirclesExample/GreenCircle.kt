package com.hala.designpatternsinkotlin.Structural.bridge.DrawingCirclesExample

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-04-09
 */
class GreenCircle : DrawAPI {
    override fun drawCircle(radius: Int, x: Int, y: Int) {
        println("Drawing Circle[ color: green, radius: $radius, x: $x, $y]")
    }
}