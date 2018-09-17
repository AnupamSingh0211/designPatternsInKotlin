package com.hala.designpatternsinkotlin.Behavioral.State.MusicPlayerExample

class StopState : PlayerState {


    override fun doAction(context: com.hala.designpatternsinkotlin.Behavioral.State.MusicPlayerExample.Context) {

        println("Player is in stop state")
        context.state = this
    }

    override fun toString(): String {
        return "Stop PlayerState"
    }
}