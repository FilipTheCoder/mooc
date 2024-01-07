/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author filip
 */
public class Timer {
    private ClockHand second;
    private ClockHand hundrethOfSecond;

    public Timer() {
        
        this.second = new ClockHand(60);
        this.hundrethOfSecond = new ClockHand(100);
    }
    
    public void advance() {
        this.hundrethOfSecond.advance();
        if(this.hundrethOfSecond.value() == 0) {
            this.second.advance();
        }
    }
    
    @Override
    public String toString() {
        return second + ":" + this.hundrethOfSecond;
    }
    
    
    
}
