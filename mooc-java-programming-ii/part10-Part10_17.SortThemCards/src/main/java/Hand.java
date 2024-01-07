
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author filip
 */
public class Hand implements Comparable<Hand> {
    private final ArrayList<Card> cards = new ArrayList();
    
    public void add(Card card) {
        cards.add(card);
    }
    public void print() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }
    public void sort() {
        Collections.sort(cards);
        
    }
    private int sum() {
        int sum = 0;
        for (Card card : cards) {
            sum += card.getValue();
        }
        return sum;
    }
    @Override
    public int compareTo(Hand o) {
        return this.sum() - o.sum();
    }
    public void sortBySuit() {
        cards.sort(new BySuitInValueOrder());
    }
}
