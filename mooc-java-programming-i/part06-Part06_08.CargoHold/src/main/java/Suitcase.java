
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
public class Suitcase {
    private ArrayList<Item> items;
    private int totalWeight;
    
    public Suitcase(int totalWeight) {
        this.items = new ArrayList();
        this.totalWeight = totalWeight;

    }
    
    public void addItem(Item item) {
        if(this.totalWeight() + item.getWeight() > this.totalWeight) {
            return;
        }
        this.items.add(item);
        
    }
    @Override
    public String toString() {
        
        if(this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        if(this.items.size() == 1) {
            return "1 item ("+this.totalWeight()+ " kg)";
        }
        
        return this.items.size() + " items ("+this.totalWeight()+ " kg)";
    }
    
    public void printItems() {
        for(Item item : items) {
            System.out.println(item);
        }
        
    }
    
    public int totalWeight() {
        if(this.items.isEmpty()) {
            return 0;
        }
        int totalWeight = 0;
        
        for(Item item : items) {
            totalWeight+= item.getWeight();
        }
        
        return totalWeight;
    }
    
    public Item heaviestItem() {
        if(this.items.isEmpty()) {
            return null;
        }
        Item heaviest = this.items.get(0);
        
        for(Item item : items) {
            if(heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
            
        }
        
        return heaviest;
    }
    
    
}
