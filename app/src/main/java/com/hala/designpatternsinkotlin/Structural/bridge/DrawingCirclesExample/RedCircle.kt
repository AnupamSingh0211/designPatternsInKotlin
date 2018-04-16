package com.hala.designpatternsinkotlin.Structural.bridge.DrawingCirclesExample

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-04-09
 */
class RedCircle : DrawAPI {
    override fun drawCircle(radius: Int, x: Int, y: Int) {
        println("Drawing Circle[ color: red, radius: $radius, x: $x, $y]")
    }
}