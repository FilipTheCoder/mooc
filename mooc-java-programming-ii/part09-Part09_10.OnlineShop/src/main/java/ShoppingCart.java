
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author filip
 */
public class ShoppingCart {

    private Map<String, Item> cart = new HashMap();

    public ShoppingCart() {
    }

    public void add(String product, int price) {
        if(!cart.containsKey(product)) {
            cart.put(product, new Item(product, 1, price));
        } else {
            Item i = cart.get(product);
            i.increaseQuantity();
        }
        
    }

    public int price() {
        int totalPrice = 0;
        for (Item i : cart.values()) {
            totalPrice += i.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Item i : cart.values()) {
            System.out.println(i);
        }
    }
    
}
