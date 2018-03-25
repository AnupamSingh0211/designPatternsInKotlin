package com.hala.designpatternsinkotlin.Structural.facade.ShapeMakerSample

import com.hala.designpatternsinkotlin.Structural.facade.ShapeMakerSample.shapemakersinternalsystem.Circle
import com.hala.designpatternsinkotlin.Structural.facade.ShapeMakerSample.shapemakersinternalsystem.Rectangle
import com.hala.designpatternsinkotlin.Structural.facade.ShapeMakerSample.shapemakersinternalsystem.Shape
import com.hala.designpatternsinkotlin.Structural.facade.ShapeMakerSample.shapemakersinternalsystem.Square

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-03-25
 */

//this is our facade class
//it knows which subsystem classes are responsible for a clients request
//eg .compiler
//delegates clients request to appropriate subsystem  objects

class ShapeMakerFacade() {

    private var circle: Shape
    private var rectangle: Shape
    private var square: Shape

    init {
        circle = Circle()
        rectangle = Rectangle()
        square = Square()
    }

    fun drawCircle() {
        circle.onDraw()
    }

    fun drawRectangle() {
        rectangle.onDraw()
    }

    fun drawSquare() {
        square.onDraw()
    }
}