package com.hala.designpatternsinkotlin.Structural.proxy.sudoUserExample

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-03-26
 */
class CommandExecutorProxy(user: String, pwd: String) : CommandExecutor {

    private var isAdmin: Boolean = false
    private val executor: CommandExecutor

    init {
        if ("Anupam" == user && "Android" == pwd) isAdmin = true
        executor = CommandExecutorImpl()
    }

    @Throws(Exception::class)
    override fun runCommand(cmd: String) {
        if (isAdmin) {
            executor.runCommand(cmd)
        } else {
            if (cmd.trim { it <= ' ' }.startsWith("rm")) {
                throw Exception("rm command is not allowed for non-admin users.")
            } else {
                executor.runCommand(cmd)
            }
        }
    }

}