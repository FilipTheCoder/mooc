
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
public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> items;
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        items = new ArrayList();
    }
    
    
    
    @Override
    public void add(Item item) {
        if(weight() + item.getWeight() <= this.capacity) {
            items.add(item);

        }
    }
    private int weight() {
        int weight = 0;
        for(Item i : items) {
            weight += i.getWeight();
        }
        return weight;
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
    
}
