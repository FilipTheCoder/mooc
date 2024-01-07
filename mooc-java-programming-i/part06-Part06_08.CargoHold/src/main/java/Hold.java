
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
public class Hold {
    private int maximumWeight;
    private int currentWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int max) {
        this.maximumWeight = max;
        this.suitcases = new ArrayList();
        this.currentWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if(this.currentWeight + suitcase.totalWeight() > this.maximumWeight) {
            return;
        }
        this.suitcases.add(suitcase);
        this.currentWeight += suitcase.totalWeight();
    }
    @Override
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.currentWeight + " kg)";
    }
    public void printItems() {
        for(Suitcase s : this.suitcases) {
            s.printItems();
        }
    }
    
    
}
