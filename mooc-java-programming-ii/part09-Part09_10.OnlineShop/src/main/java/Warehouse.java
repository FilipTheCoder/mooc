
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author filip
 */
public class Warehouse {
    private Map<String, Integer> prices = new HashMap();
    private Map<String, Integer> stocks = new HashMap();
    
    
    
    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        stocks.put(product, stock);
    }
    public int price(String product) {
        return prices.getOrDefault(product, -99);
    }
    public int stock(String product) {
        return stocks.getOrDefault(product, 0);
    }
    public boolean take(String product) {
        Integer stock = stocks.get(product);
        if(stock == null) {
            return false;
        }
        if(stock <= 0) {
            return false;
        }
        stock--;
        stocks.put(product, stock);
        
        return true;

    }
    public Set<String> products() {
        return prices.keySet();
    }
}
