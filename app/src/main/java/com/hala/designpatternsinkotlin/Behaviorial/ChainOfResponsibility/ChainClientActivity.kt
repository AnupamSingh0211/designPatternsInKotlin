package com.hala.designpatternsinkotlin.Behaviorial.ChainOfResponsibility

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hala.designpatternsinkotlin.R

class ChainClientActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chain_of_responsibility)
        runCashDispenserDemo()
    }

    private fun runCashDispenserDemo() {

        val cashDispenser: CashDispenser = CashDispenser(100)
        cashDispenser.setNextDispenser(CashDispenser(50))
        cashDispenser.setNextDispenser(CashDispenser(20))
        cashDispenser.setNextDispenser(CashDispenser(10))
        cashDispenser.setNextDispenser(CashDispenser(5))
        cashDispenser.setNextDispenser(CashDispenser(2))
        cashDispenser.setNextDispenser(CashDispenser(1))

        val amountTobeWithdrawn = 324;
        cashDispenser.dispense(amountTobeWithdrawn)
    }


}