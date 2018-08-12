package com.hala.designpatternsinkotlin.Behavioral.Strategy

class DefensiveStrategy : IGameStrategy {

    override fun atack(): Double {
        return 0.2
    }

    override fun defence(): Double {
        return 0.8
    }
}