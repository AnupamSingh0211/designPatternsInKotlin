package com.hala.designpatternsinkotlin.Behaviorial.ChainOfResponsibility

class CashDispenser(value: Int) {

    var demonimator: Int = value
    var cashDispenserNext: CashDispenser? = null

    //method to chain dispensers

    fun setNextDispenser(cashDispenser: CashDispenser) {
        if (cashDispenserNext == null) {
            cashDispenserNext = cashDispenser

        } else
            cashDispenserNext?.setNextDispenser(cashDispenser)

    }

    fun dispense(amount: Int) {

        if (amount >= demonimator) {
            val number = amount / demonimator
            val balance = amount % demonimator
            System.out.println(number.toString() + "*" + demonimator + "$")
            if (balance != 0) {
                cashDispenserNext?.dispense(balance)
            } else
                cashDispenserNext?.dispense(amount)
        }


    }

}