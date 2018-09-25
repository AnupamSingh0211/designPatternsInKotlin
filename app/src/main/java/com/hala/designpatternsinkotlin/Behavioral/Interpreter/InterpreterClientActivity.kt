package com.hala.designpatternsinkotlin.Behavioral.Interpreter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hala.designpatternsinkotlin.Behavioral.Interpreter.MathsExpressionsExample.*
import java.util.*

class InterpreterClientActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interpreter)
        runMathsExpressionDemo()
    }

    fun runMathsExpressionDemo() {


        var postFixToRun = "543-2+*"

        var operators = "+-*/"

        var stack = Stack<Expression>()


        for (Char c : postFixToRun.toCharArray()){

            var resultExp: Expression

            if (operators.indexOf(c) == -1) {
                //number found
                resultExp = Number(c - 48);
            } else {
                var right: Expression
                var left: Expression

                when (c) {
                    '+' ->
                        resultExp = AddExpression(left, right)
                    '-' ->
                        resultExp = SubtractExpression(left, right)
                    '*' ->
                        resultExp = MultiplyExpression(left, right)
                    '/' ->
                        resultExp = DivideExpression(left, right)


                }

            }
            stack.push(Number(resultExp.evaluate()))
        }

        System.out.println("Result :" + stack.pop().evaluate())
    }


}