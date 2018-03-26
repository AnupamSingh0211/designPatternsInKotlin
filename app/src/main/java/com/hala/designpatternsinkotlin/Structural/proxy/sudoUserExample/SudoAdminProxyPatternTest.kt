package com.hala.designpatternsinkotlin.Structural.proxy.sudoUserExample

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-03-26
 */
class SudoAdminProxyPatternTest {

    fun main() {
        val executor = CommandExecutorProxy("Anupam", "Android")
        try {
            executor.runCommand("ls -ltr")
            executor.runCommand(" rm -rf abc.pdf")
        } catch (e: Exception) {
            println("Exception Message::" + e.message)
        }

    }

}