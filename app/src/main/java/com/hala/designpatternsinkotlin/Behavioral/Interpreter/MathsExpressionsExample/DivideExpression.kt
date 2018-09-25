package com.hala.designpatternsinkotlin.Behavioral.Interpreter.MathsExpressionsExample

class DivideExpression(var first: Expression, var second: Expression) : Expression {


    override fun evaluate(): Int {
        return first.evaluate() / second.evaluate();
    }
}