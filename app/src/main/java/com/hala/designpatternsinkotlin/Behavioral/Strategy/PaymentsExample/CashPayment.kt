package com.hala.designpatternsinkotlin.Behavioral.Strategy.PaymentsExample


class CashPayment(private var amount: Double) : PaymentStrategy {

    override fun pay() {
        System.out.println( "Cash  " + amount + "$")
    }
}