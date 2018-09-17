package com.hala.designpatternsinkotlin.Behavioral.ChainOfResponsibility.loggingExample

abstract class AbstractLogger {

    protected var level: Int = 0

    //next element in chain or responsibility
    var nextLogger: AbstractLogger? = null

//    fun setNextLogger(nextLogger: AbstractLogger) {
//        this.nextLogger = nextLogger
//    }

    fun logMessage(level: Int, message: String) {
        if (this.level <= level) {
            write(message)
        }
        if (nextLogger != null) {
            nextLogger!!.logMessage(level, message)
        }
    }

    protected abstract fun write(message: String)

    companion object {
        var INFO = 1
        var DEBUG = 2
        var ERROR = 3
    }

}