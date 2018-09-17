package com.hala.designpatternsinkotlin.Behavioral.ChainOfResponsibility.loggingExample

class FileLogger(level: Int) : AbstractLogger() {

    init {
        this.level = level
    }

    override fun write(message: String) {
        println("File::Logger: $message")
    }
}