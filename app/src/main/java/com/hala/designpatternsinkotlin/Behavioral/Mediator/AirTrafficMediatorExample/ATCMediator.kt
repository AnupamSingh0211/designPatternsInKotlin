package com.hala.designpatternsinkotlin.Behavioral.Mediator.AirTrafficMediatorExample


interface ATCMediator {

    fun registerRunway(runway: Runway)
    fun registerGate(gate: Gate)
    fun getLandingPerrmission(flight: Flight): Boolean
    fun getTakeOffPerrmission(flight: Flight): Boolean
    fun enterRunway(runway: Runway)
    fun exitRunWay(runway: Runway)
    fun enterGate(gate: Gate)
    fun exitGate(gate: Gate)


}