
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author filip
 */
public class DictionaryOfManyTranslations {
    private final HashMap<String, ArrayList<String>> dict = new HashMap();
    public void add(String word, String translation) {
        if(this.dict.containsKey(word)) {
            this.dict.get(word).add(translation);
            return;
        }
        this.dict.put(word, new ArrayList(Collections.singletonList(translation)));
        
        
    }
    public ArrayList<String> translate(String word) {
        if(this.dict.containsKey(word)) {
            return (ArrayList<String>)this.dict.get(word).clone();
        }
        return new ArrayList();
    }
    public void remove(String word) {

        this.dict.remove(word);
        
           
        
    }
}
