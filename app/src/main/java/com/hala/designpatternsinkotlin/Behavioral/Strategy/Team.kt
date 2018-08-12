package com.hala.designpatternsinkotlin.Behavioral.Strategy

class Team(private val teamName: String, var gameStrategy: IGameStrategy) {

    fun play() {
        System.out.println(teamName + " will play -> attack: " + gameStrategy.atack() + " , defence: " + gameStrategy.defence())
    }

}