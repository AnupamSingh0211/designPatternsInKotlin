package com.hala.designpatternsinkotlin.Structural.facade.BankSystemExample.banksinternalsystem

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-03-25
 */
class Debit : Account {
    override fun onTransaction() {
        println("Debit Transaction : Money Removed")
    }
}