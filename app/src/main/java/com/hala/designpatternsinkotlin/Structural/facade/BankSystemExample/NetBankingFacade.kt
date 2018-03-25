package com.hala.designpatternsinkotlin.Structural.facade.BankSystemExample

import com.hala.designpatternsinkotlin.Structural.facade.BankSystemExample.banksinternalsystem.Credit
import com.hala.designpatternsinkotlin.Structural.facade.BankSystemExample.banksinternalsystem.Debit
import com.hala.designpatternsinkotlin.Structural.facade.BankSystemExample.banksinternalsystem.Validator


/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-03-25
 */
class NetBankingFacade() {

    private var credit: Credit
    private var debit: Debit
    private var validator: Validator

    init {
        credit = Credit()
        debit = Debit()
        validator = Validator()
    }

    fun creditMoney() {
        if (validator.checkIfAccountExceedsCreditLimits())
            validator.creditFailureMessage()
        else
            credit.onTransaction()
    }

    fun debitMoney() {
        if (validator.checkIfAccountHasEnoughMoneyForTransaction())
            validator.debitFailureMesssage()
        else
            debit.onTransaction()
    }
}
