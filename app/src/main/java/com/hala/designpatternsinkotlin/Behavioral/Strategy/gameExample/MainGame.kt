package com.hala.designpatternsinkotlin.Behavioral.Strategy.gameExample

fun main(args : Array<String>) {

    val argentinaTeam = Team("Argentina", AttackingStrategy())
    val brazilTeam = Team("Brazil", DefensiveStrategy())

    argentinaTeam.play()
    brazilTeam.play()

    // change strategy in runtime
    brazilTeam.gameStrategy = AttackingStrategy()

    argentinaTeam.play()
    brazilTeam.play()

}