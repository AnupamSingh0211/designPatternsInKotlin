package com.hala.designpatternsinkotlin.Behavioral.Strategy.gameExample

class AttackingStrategy : IGameStrategy {

    override fun atack(): Double {
        return 0.8
    }

    override fun defence(): Double {
        return 0.2
    }
}