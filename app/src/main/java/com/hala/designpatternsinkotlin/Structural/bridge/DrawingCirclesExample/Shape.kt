package com.hala.designpatternsinkotlin.Structural.bridge.DrawingCirclesExample

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-04-09
 */
abstract class Shape protected constructor(protected var drawAPI: DrawAPI) {
    abstract fun draw()
}