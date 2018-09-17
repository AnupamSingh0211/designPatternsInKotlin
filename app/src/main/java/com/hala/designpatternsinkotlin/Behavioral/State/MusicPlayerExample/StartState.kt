package com.hala.designpatternsinkotlin.Behavioral.State.MusicPlayerExample



class StartState : PlayerState {
    override fun doAction(context: Context) {

        println("Player is in start state")
        context.state = this
    }


    override fun toString(): String {
        return "Start PlayerState"
    }
}