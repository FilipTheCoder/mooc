/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author filip
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
    
    public void eatAffordably() {
        double cost = 2.6;
        if(this.balance - cost >= 0)
            this.balance -= cost;
    }

    public void eatHeartily() {
        double cost = 4.6;
        if(this.balance - cost >= 0)
            this.balance -= cost;
    }
    public void addMoney(double amount) {
        double topUp = 150;
        if(amount <= 0)
            return;
        this.balance += amount;
        
        if(this.balance > topUp) {
            this.balance = topUp;
        }
    }
}
