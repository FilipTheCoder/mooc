
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
public class Pipe<T> {
    private final ArrayList<T> pipe = new ArrayList();
    public void putIntoPipe(T value) {
        pipe.add(value);
    }
    public T takeFromPipe() {
        if(pipe.isEmpty()) {
            return null;
        }
        return pipe.remove(0);
    }
    public boolean isInPipe() {
      return !pipe.isEmpty();
    }
}
