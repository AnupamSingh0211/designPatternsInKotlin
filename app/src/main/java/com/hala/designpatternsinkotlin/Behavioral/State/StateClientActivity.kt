package com.hala.designpatternsinkotlin.Behavioral.State

import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hala.designpatternsinkotlin.Behavioral.State.MusicPlayerExample.Context
import com.hala.designpatternsinkotlin.R

import com.hala.designpatternsinkotlin.Behavioral.State.MusicPlayerExample.StopState
import com.hala.designpatternsinkotlin.Behavioral.State.MusicPlayerExample.StartState


class StateClientActivity : AppCompatActivity() {

    override fun setContentView(view: View?) {
        super.setContentView(view)
        setContentView(R.layout.activity_state)
        runMusicPlayerDemo()
    }

    private fun runMusicPlayerDemo() {

        var context = Context()

        val startState = StartState()
        startState.doAction(context)

        System.out.println(context.state.toString())

        val stopState = StopState()
        stopState.doAction(context)

        System.out.println(context.state.toString())
    }

}