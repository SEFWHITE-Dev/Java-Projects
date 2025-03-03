/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author shota
 */
public class Flight {
    
    private Airplane airplane;
    private Place departureAirport;
    private Place targetAirport;

    public Flight(Airplane airplane, Place departureAirport, Place arrivalAirport) {
        this.airplane = airplane;
        this.departureAirport = departureAirport;
        this.targetAirport = arrivalAirport;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public Place getDepartureAirport() {
        return departureAirport;
    }

    public Place getTargetAirport() {
        return targetAirport;
    }
    
    public String toString() {
        return this.airplane.toString() + " (" + this.departureAirport + "-" + this.targetAirport + ")";
    }
    
}

