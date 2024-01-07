
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
public class Herd implements Movable {
    private ArrayList<Movable> herd = new ArrayList();
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Movable movable : herd) {
            builder.append(movable.toString()).append('\n');
        }
        return builder.toString();
    }
    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : herd) {
            movable.move(dx, dy);
        }
    }
    
}
