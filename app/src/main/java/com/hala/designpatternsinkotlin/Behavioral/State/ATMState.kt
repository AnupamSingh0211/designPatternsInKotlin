package com.hala.designpatternsinkotlin.Behavioral.State

// Different states expected
// HasCard, NoCard, HasPin, NoCash

interface ATMState {

    // these are the methods that a user can do with a ATM
    fun insertCard()
    fun ejectCard()
    fun insertPin(pinEntered: Int)
    fun requestCash(cashToWithdraw: Int)
}