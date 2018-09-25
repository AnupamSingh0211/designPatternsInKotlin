package com.hala.designpatternsinkotlin.Behavioral.Mediator.AirTrafficMediatorExample

class ATCMediatorImpl(var gates: ArrayList<Gate>) : ATCMediator {

    lateinit var runway: Runway


    override fun registerRunway(runway: Runway) {
        this.runway = runway
    }

    override fun registerGate(gate: Gate) {
        gates.add(gate)
    }

    override fun getLandingPerrmission(flight: Flight): Boolean {

        if (runway.inUse == false) {


            for (int i = 0; i < gates.size(); i++)
            {
                if (gates.get(i).inUse) == false {

                    flight.allocateRunWay(runway)
                    flight.allocateGate(gates.get(i))
                    return true;
                }
            }

        }
        //all gates in use
        else
        //run way is in use
            return false;
    }

    override fun getTakeOffPerrmission(flight: Flight): Boolean {
  return runway.inUse == false

    }

    override fun enterRunway(runway: Runway) {
runway.inUse = true
    }

    override fun exitRunWay(runway: Runway) {
        runway.inUse = false
    }

    override fun enterGate(gate: Gate) {
     gate.inUse=  true
    }

    override fun exitGate(gate: Gate) {
        gate.inUse=  false
    }
}