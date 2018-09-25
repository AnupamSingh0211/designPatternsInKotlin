package com.hala.designpatternsinkotlin.Behavioral.ChainOfResponsibility

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hala.designpatternsinkotlin.Behavioral.ChainOfResponsibility.cashDespense.CashDispenser
import com.hala.designpatternsinkotlin.R
import com.hala.designpatternsinkotlin.Behavioral.ChainOfResponsibility.loggingExample.AbstractLogger
import com.hala.designpatternsinkotlin.Behavioral.ChainOfResponsibility.loggingExample.ConsoleLogger
import com.hala.designpatternsinkotlin.Behavioral.ChainOfResponsibility.loggingExample.FileLogger
import com.hala.designpatternsinkotlin.Behavioral.ChainOfResponsibility.loggingExample.ErrorLogger





class ChainClientActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chain_of_responsibility)
        //runCashDispenserDemo()
        runLoggerDemo()
    }

    private fun runLoggerDemo() {
        val loggerChain = getChainOfLoggers()

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.")

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.")

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.")
    }

    private fun getChainOfLoggers(): AbstractLogger {

        val errorLogger = ErrorLogger(AbstractLogger.ERROR)
        val fileLogger = FileLogger(AbstractLogger.DEBUG)
        val consoleLogger = ConsoleLogger(AbstractLogger.INFO)

        errorLogger.nextLogger = fileLogger
        fileLogger.nextLogger = consoleLogger

        return errorLogger
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