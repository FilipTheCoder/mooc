
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
public class Stack {
    private ArrayList<String> items;

    public Stack() {
        this.items = new ArrayList();
    }
    
    public boolean isEmpty() {
        return items.isEmpty();
    }
    public void add(String value) {
        items.add(value);
    }
    public ArrayList<String> values() {
        return items;
    }
    public String take() {
        String topMost = this.items.get(this.items.size() - 1);
        items.remove(this.items.size() - 1);
        return topMost;
    }
    
    
    
    
}
