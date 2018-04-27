package com.hala.designpatternsinkotlin.Structural.flyweight.circleExample

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-04-27
 */

class ShapeFactory {

    companion object {
        private val circleMap: HashMap<String, Circle> = HashMap()

        fun getCircle(color: String): Shape {
            var circle: Circle? = circleMap.get(color)

            if (circle == null) {
                circle = Circle(color)
                circleMap.put(color, circle)
                println("Creating circle of color : " + color)
            }
            return circle
        }
    }

}