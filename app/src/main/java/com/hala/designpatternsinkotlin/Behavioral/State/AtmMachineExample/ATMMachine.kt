package com.hala.designpatternsinkotlin.Behavioral.State.AtmMachineExample

class ATMMachine {

    val yesCardState: ATMState
    val noCardState: ATMState
    val hasPinState: ATMState
    val noCashState: ATMState

    internal var atmState: ATMState

    internal var cashInMachine = 2000

    init {
        yesCardState = HasCard(this)
        noCardState = NoCard(this)
        hasPinState = HasPin(this)
        noCashState = NoCash(this)

        atmState = noCardState

        if (cashInMachine <= 0) {
            atmState = noCashState
        }
    }

    fun setATMState(newATMState: ATMState) {
        atmState = newATMState
    }

    fun setCashInMachine(newCashInMachine: Int) {
        cashInMachine = newCashInMachine
    }

    // these 4 functions will be called on there respective states...
    fun insertCard() {
        atmState.insertCard()
    }

    fun ejectCard() {
        atmState.ejectCard()
    }

    fun requestCash(cashToWithdraw: Int) {
        atmState.requestCash(cashToWithdraw)
    }

    fun insertPin(pinEntered: Int) {
        atmState.insertPin(pinEntered)
    }

}