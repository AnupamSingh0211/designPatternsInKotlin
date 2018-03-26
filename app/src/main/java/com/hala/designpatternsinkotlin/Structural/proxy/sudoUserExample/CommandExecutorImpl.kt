package com.hala.designpatternsinkotlin.Structural.proxy.sudoUserExample

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-03-26
 */
import java.io.IOException

class CommandExecutorImpl : CommandExecutor {

    @Throws(IOException::class)
    override fun runCommand(cmd: String) {
        //some heavy implementation
        Runtime.getRuntime().exec(cmd)
        println("'$cmd' command executed.")
    }

}