package com.hala.designpatternsinkotlin.Structural.proxy.sudoUserExample

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-03-26
 */
interface CommandExecutor {

    @Throws(Exception::class)
    fun runCommand(cmd: String)
}