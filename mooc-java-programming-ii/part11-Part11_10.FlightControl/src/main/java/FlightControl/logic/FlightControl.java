/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import FlightControl.domain.Plane;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author filip
 */
public class FlightControl {

    private HashMap<String, Plane> planes = new HashMap();
    private HashMap<String, Flight> flights = new HashMap();
    private HashMap<String, Place> places = new HashMap();

    public void addPlane(String id, int capacity) {
        planes.put(id, new Plane(id, capacity));
    }
    public void addFlight(Plane plane, String departureId, String destinationId) {
        places.putIfAbsent(departureId, new Place(departureId));
        places.putIfAbsent(destinationId, new Place(destinationId));
        Flight flight = new Flight(plane, places.get(departureId), places.get(destinationId));
        flights.put(flight.toString(), flight);
    }

    public Collection<Plane> getPlanes() {
        return planes.values();
    }

    public Collection< Flight> getFlights() {
        return flights.values();
    }

    public Collection<Place> getPlaces() {
        return places.values();
    }
    public Plane getPlane(String id) {
        return planes.get(id);
    }
    
}
