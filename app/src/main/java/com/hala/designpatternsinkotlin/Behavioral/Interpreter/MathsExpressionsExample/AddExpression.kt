package com.hala.designpatternsinkotlin.Behavioral.Interpreter.MathsExpressionsExample

class AddExpression(var first: Expression, var second: Expression) : Expression {


    override fun evaluate(): Int {
        return first.evaluate() + second.evaluate();
    }
}