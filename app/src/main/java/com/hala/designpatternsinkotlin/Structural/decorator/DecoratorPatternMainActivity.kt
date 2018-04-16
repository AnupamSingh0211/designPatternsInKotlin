package com.hala.designpatternsinkotlin.Structural.decorator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hala.designpatternsinkotlin.R
import com.hala.designpatternsinkotlin.Structural.decorator.ShapeDecorationExample.Circle
import com.hala.designpatternsinkotlin.Structural.decorator.ShapeDecorationExample.Rectangle
import com.hala.designpatternsinkotlin.Structural.decorator.ShapeDecorationExample.RedShapeDecorator
import com.hala.designpatternsinkotlin.Structural.decorator.startbucksExample.Beverage
import com.hala.designpatternsinkotlin.Structural.decorator.startbucksExample.Espresso
import com.hala.designpatternsinkotlin.Structural.decorator.startbucksExample.Milk
import com.hala.designpatternsinkotlin.Structural.decorator.startbucksExample.Mocha


/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-04-09
 */
class DecoratorPatternMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_decorator)
        //runShapeDecorationDemo()
        runStarBucksDemo()
    }

    private fun runStarBucksDemo() {

        val beverage = Espresso()
        println(beverage.description)
        println(beverage.cost())

        var beverage2: Beverage = Espresso()
        beverage2 = Mocha(beverage2)
        beverage2 = Milk(beverage2)

        println(beverage2.description)

        println(beverage2.cost())

    }

    private fun runShapeDecorationDemo() {

//Shape
        val circle = Circle()
//Shape
        val redCircle = RedShapeDecorator(Circle())
//Shape
        val redRectangle = RedShapeDecorator(Rectangle())
        println("Circle with normal border")
        circle.draw()

        println("\nCircle of red border")
        redCircle.draw()

        println("\nRectangle of red border")
        redRectangle.draw()

    }
}