package com.hala.designpatternsinkotlin.Behavioral.State.MusicPlayerExample

class Context {
    var state: PlayerState? = null

    init {
        state = null
    }
}