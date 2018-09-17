package com.hala.designpatternsinkotlin.Behavioral.State.AtmMachineExample

class NoCash(internal var atmMachine: ATMMachine) : ATMState {

    override fun insertCard() {
        println("We don't have any money")
        println("Your card is ejected")
    }

    override fun ejectCard() {
        println("We don't have any money")
        println("There is no card to eject")
    }

    override fun requestCash(cashToWithdraw: Int) {
        println("We don't have any money")
    }

    override fun insertPin(pinEntered: Int) {
        println("We don't have any money")
    }
}