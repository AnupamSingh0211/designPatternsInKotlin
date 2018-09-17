package com.hala.designpatternsinkotlin.Behavioral.ChainOfResponsibility.loggingExample

class ErrorLogger(level: Int) : AbstractLogger() {

    init {
        this.level = level
    }

    override fun write(message: String) {
        println("Error Console::Logger: $message")
    }
}
