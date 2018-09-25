package com.hala.designpatternsinkotlin.Behavioral.Mediator.AirTrafficMediatorExample

class Flight(var atcMediator: ATCMediator, var flightNumer: String) {


    lateinit var runway: Runway
    lateinit var gate: Gate

    fun allocateRunWay(runWay: Runway) {

        this.runway = runWay;

    }

    fun allocateGate(gate: Gate) {

        this.gate = gate;

    }


    fun landAndTakeOff(){

        //request landing

        while (false == atcMediator.getLandingPerrmission(this)){
            //wait

        }

        //permission granted
        land()


        while (false == atcMediator.getTakeOffPerrmission(this)){
            //wait

        }
                //permission granted
        takeOff()


    }

    fun land() {
        atcMediator.enterRunway(runway)
        //is landing at gate gate.gateNum

        //exit now
        //after some delay

        atcMediator.exitRunWay(runway)
        atcMediator.enterGate(gate)

    }

    fun takeOff() {

        // some delay

        atcMediator.exitGate(gate)
        atcMediator.enterRunway(runway)

        //some delay

        atcMediator.exitRunWay(runway);


    }


}