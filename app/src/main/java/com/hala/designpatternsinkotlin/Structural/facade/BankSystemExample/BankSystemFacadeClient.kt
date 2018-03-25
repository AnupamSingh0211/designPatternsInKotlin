package com.hala.designpatternsinkotlin.Structural.facade.BankSystemExample

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-03-25
 */
class BankSystemFacadeClient {

    fun main() {
        val netBankingFacade = NetBankingFacade()
        netBankingFacade.debitMoney()
        netBankingFacade.creditMoney()


    }
}