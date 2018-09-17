package com.hala.designpatternsinkotlin.Behavioral.Strategy.PaymentsExample

class CardPayment(var cardType: String, var issuer: String, private var amount: Double) : PaymentStrategy {

    override fun pay() {
        System.out.println(issuer + " " + cardType + " " + amount + "$")
    }
}