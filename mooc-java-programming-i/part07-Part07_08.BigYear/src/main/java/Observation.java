/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author filip
 */
public class Observation {
    private Bird bird;
    private int numberOfObservations = 0;

    public Observation(Bird bird) {
        this.bird = bird;
    }
    public void observed() {
        numberOfObservations++;
    }

    public Bird getBird() {
        return bird;
    }

    public int getNumberOfObservations() {
        return numberOfObservations;
    }

    @Override
    public String toString() {
        return this.bird + ": " + this.numberOfObservations + " observations";
    }
    
}
