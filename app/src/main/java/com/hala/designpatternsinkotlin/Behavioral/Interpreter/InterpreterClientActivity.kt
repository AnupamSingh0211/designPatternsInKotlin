package com.hala.designpatternsinkotlin.Behavioral.Interpreter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hala.designpatternsinkotlin.Behavioral.Interpreter.MathsExpressionsExample.*
import com.hala.designpatternsinkotlin.R
import java.util.*

class InterpreterClientActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interpreter)
        runMathsExpressionDemo()
    }

    fun runMathsExpressionDemo() {


        val postFixToRun = "543-2+*"

        val operators = "+-*/"

        val stack = Stack<Expression>()


        for (c in postFixToRun.toCharArray()){

             var  resultExp : Expression = Number(0)

            if (operators.indexOf(c) == -1) {
                //number found
                resultExp = Number(c.toInt() - 48);
            } else {
                val right: Expression = stack.pop()
                val left: Expression = stack.pop()

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