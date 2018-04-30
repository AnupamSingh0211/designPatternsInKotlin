package com.hala.designpatternsinkotlin.Structural.flyweight.circleExample

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-04-27
 */

class ShapeClient {


companion object {
    private val colors = arrayOf("Red", "Green", "Blue", "White", "Black")
    private val randomColor: String
        get() = colors[(Math.random() * colors.size).toInt()]
    private val randomX: Int
        get() = (Math.random() * 100).toInt()
    private val randomY: Int
        get() = (Math.random() * 100).toInt()

    fun main() {

        for (i in 0..19) {
            val circle = ShapeFactory.getCircle(randomColor) as Circle
            circle.setX(randomX)
            circle.setY(randomY)
            circle.setRadius(100)
            circle.draw()
        }
    }
}

}