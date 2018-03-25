package com.hala.designpatternsinkotlin.Structural.facade.ShapeMakerSample

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-03-25
 */
class ShapeMakerFacadeClient {

    fun main(){

        val shapeMaker = ShapeMakerFacade()
        shapeMaker.drawCircle()
        shapeMaker.drawRectangle()
        shapeMaker.drawSquare()

    }
}