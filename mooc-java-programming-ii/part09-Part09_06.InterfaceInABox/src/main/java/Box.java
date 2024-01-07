
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author filip
 */
public class Box implements Packable {
    private ArrayList<Packable> things = new ArrayList();
    private double maxCapacity;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
    
    public void add(Packable thing) {
        if(weight() + thing.weight() > maxCapacity) {
            return;
        }
        things.add(thing);
    }
    
    public double weight() {
        double totalWeight = 0;
        for(Packable p : things) {
            totalWeight += p.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Box: "  + this.things.size() + " items, total weight " + weight() + " kg";
    }
    
    
}
