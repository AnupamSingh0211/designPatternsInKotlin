package com.hala.designpatternsinkotlin.Behavioral.Strategy.PaymentsExample

class Order {
    var cart: ArrayList<Item> = ArrayList()
    var payments: ArrayList<PaymentStrategy> = ArrayList()
    fun addItem(item: Item) {
        cart.add(item)
        System.out.println(item.name + " :" + item.price)

    }

    fun makePayment(pm: PaymentStrategy) {
        payments.add(pm)
        pm.pay()

    }


}