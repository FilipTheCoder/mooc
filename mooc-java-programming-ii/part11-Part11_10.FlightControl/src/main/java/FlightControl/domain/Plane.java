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
public class Plane {
    private String Id;
    private int capacity;

    public Plane(String Id, int capacity) {
        this.Id = Id;
        this.capacity = capacity;
    }

    public String getId() {
        return Id;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return Id + " (" +  capacity + " capacity)";
    }
    
}
