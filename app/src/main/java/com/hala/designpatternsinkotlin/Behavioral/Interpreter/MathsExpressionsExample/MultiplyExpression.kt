package com.hala.designpatternsinkotlin.Behavioral.Interpreter.MathsExpressionsExample

class MultiplyExpression(var first: Expression, var second: Expression) : Expression {


    override fun evaluate(): Int {
        return first.evaluate() * second.evaluate();
    }
}