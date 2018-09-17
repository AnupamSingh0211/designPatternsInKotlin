package com.hala.designpatternsinkotlin.Behavioral.Template

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hala.designpatternsinkotlin.R

class TemplateClientActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_template_method)
        runOrderPizzaDemo()
    }

    private fun runOrderPizzaDemo() {
        System.out.println("Preparing Cheese pizza")
        val pizza1 = CheesePizza()
        pizza1.preparePizza()

        val pizza2 = MeatPizza()
        pizza2.preparePizza()

    }

}