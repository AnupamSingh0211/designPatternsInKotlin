package com.hala.designpatternsinkotlin.Behavioral.State.AtmMachineExample

class HasPin(internal var atmMachine: ATMMachine) : ATMState {

    override fun insertCard() {
        println("You already entered a card")
    }

    override fun ejectCard() {
        println("Your card is ejected")
        atmMachine.setATMState(atmMachine.noCardState)
    }

    override fun requestCash(cashToWithdraw: Int) {
        if (cashToWithdraw > atmMachine.cashInMachine) {
            println("We don't have that much cash available")
            println("Your card is ejected")
            atmMachine.setATMState(atmMachine.noCardState)
        } else {
            println(cashToWithdraw.toString() + " is provided by the machine")
            atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw)
            println("Your card is ejected")
            atmMachine.setATMState(atmMachine.noCardState)
            if (atmMachine.cashInMachine <= 0) {
                atmMachine.setATMState(atmMachine.noCashState)
            }
        }
    }

    override fun insertPin(pinEntered: Int) {
        println("You already entered a PIN")
    }
}