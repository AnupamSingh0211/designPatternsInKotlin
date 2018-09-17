package com.hala.designpatternsinkotlin.Behavioral.Strategy

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hala.designpatternsinkotlin.Behavioral.Strategy.PaymentsExample.CardPayment
import com.hala.designpatternsinkotlin.Behavioral.Strategy.PaymentsExample.CashPayment
import com.hala.designpatternsinkotlin.Behavioral.Strategy.PaymentsExample.Item
import com.hala.designpatternsinkotlin.Behavioral.Strategy.PaymentsExample.Order
import com.hala.designpatternsinkotlin.R

class StrategyClientActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_strategy)
        runCartDemo()
    }

    private fun runCartDemo() {

        var order = Order()
        order.addItem(Item("Italian Pizza", 6.99))
        order.addItem(Item("Wine ", 10.99))

        order.addItem(Item("Burger ", 2.99))

        order.addItem(Item("Coke ", 1.99))

        order.addItem(Item("Pani puri ", 0.99))

        order.makePayment(CashPayment(10.00))
        order.makePayment(CardPayment("CREDIT", "VISA", 10.00))
        order.makePayment(CardPayment("DEBIT", "AMEX", 5.00))


    }


}
