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
    private int amount = 0;
    private int max = 100;

    public Container() {
    }

    public int contains() {
        return amount;
    }
    public void add(int volume) {
        if(volume < 0) {
            return;
        }
        if (amount + volume > max) {
            amount = 100;
            return;
        }
        amount += volume;
    }
    public void remove(int volume) {
        if(volume < 0) {
            return;
        }
        if (amount - volume < 0) {
            amount = 0;
            return;
        }
        amount -= volume;
    } 

    @Override
    public String toString() {
        return this.amount + "/" + this.max;
    }
}
