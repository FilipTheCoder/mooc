/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author filip
 */
public class Container {
    private int amount;
    private int ceiling;
    
    public Container() {
        this.amount = 0;
        this.ceiling = 100;
    }
    public void add(int amount) {
        if(amount < 0) {
            return;
        }
        if(this.amount + amount > this.ceiling) {
            this.amount = this.ceiling;
            return;
        }
        this.amount += amount;
    }
    public void remove(int amount) {
        if(amount < 0) {
            return;
        }
        if(this.amount - amount < 0) {
            this.amount = 0;
            return;
        }
        this.amount -= amount;
        
    }
    public int contains()  {
        return this.amount;
    }
    @Override
    public String toString() {
        return this.amount + "/" + this.ceiling;
    }
}
