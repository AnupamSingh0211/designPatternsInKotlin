package com.hala.designpatternsinkotlin.Behavioral.State.AtmMachineExample

class HasCard(private val atmMachine: ATMMachine) : ATMState {

    override fun insertCard() {
        println("You can only insert one card at a time")
    }

    override fun ejectCard() {
        println("Your card is ejected")
        atmMachine.setATMState(atmMachine.noCardState)
    }

    override fun requestCash(cashToWithdraw: Int) {
        println("You have not entered your PIN")
    }

    override fun insertPin(pinEntered: Int) {
        if (pinEntered == 1234) {
            println("You entered the correct PIN")
            atmMachine.setATMState(atmMachine.hasPinState)
        } else {
            println("You entered the wrong PIN")
            println("Your card is ejected")
            atmMachine.setATMState(atmMachine.noCardState)
        }
    }
}