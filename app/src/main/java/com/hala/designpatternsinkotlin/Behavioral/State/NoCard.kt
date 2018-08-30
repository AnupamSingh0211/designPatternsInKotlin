package com.hala.designpatternsinkotlin.Behavioral.State

class NoCard(internal var atmMachine: ATMMachine) : ATMState {

    override fun insertCard() {
        println("Please enter your pin")
        atmMachine.setATMState(atmMachine.yesCardState)
    }

    override fun ejectCard() {
        println("You didn't enter a card")
    }

    override fun requestCash(cashToWithdraw: Int) {
        println("You have not entered your card")
    }

    override fun insertPin(pinEntered: Int) {
        println("You have not entered your card")
    }
}