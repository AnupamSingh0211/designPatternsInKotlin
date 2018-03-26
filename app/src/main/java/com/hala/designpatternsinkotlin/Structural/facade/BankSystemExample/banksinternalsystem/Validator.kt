package com.hala.designpatternsinkotlin.Structural.facade.BankSystemExample.banksinternalsystem

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-03-25
 */
class Validator {
    fun checkIfAccountHasEnoughMoneyForTransaction(): Boolean = true

    fun checkIfAccountExceedsCreditLimits(): Boolean = true

    fun creditFailureMessage() = println("sorry you cannot credit to this account")

    fun debitFailureMesssage() = println("sorry you cannot debit from this account")

}