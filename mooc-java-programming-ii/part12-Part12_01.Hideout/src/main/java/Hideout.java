
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
public class Hideout<T> {
    private T stash = null;
    
    public void putIntoHideout(T toHide) {

        stash = toHide;
    }
    public T takeFromHideout() {
        T tmp = stash;
        stash = null;
        return tmp;
    }
    public boolean isInHideout() {
        return stash != null;
    }
            
}
