/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author filip
 */
public class Flight {
    private Plane plane;
    private Place departure;
    private Place destination;

    public Flight(Plane plane, Place departure, Place destination) {
        this.plane = plane;
        this.departure = departure;
        this.destination = destination;
    }

    public Plane getPlane() {
        return plane;
    }

    public Place getDeparture() {
        return departure;
    }

    public Place getDestination() {
        return destination;
    }
    
    @Override
    public String toString() {
        
        return this.plane + " (" + this.departure  + "-" + this.destination + ")";
    }
}
