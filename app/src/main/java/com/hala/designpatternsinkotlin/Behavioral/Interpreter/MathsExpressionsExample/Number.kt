package com.hala.designpatternsinkotlin.Behavioral.Interpreter.MathsExpressionsExample

class Number(var number: Int) : Expression {

    override fun evaluate(): Int {
        return number
    }


}