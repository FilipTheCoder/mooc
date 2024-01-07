/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author filip
 */
public class Dictionary {
    private Map<String, String> translations = new HashMap<>();
    public Dictionary() {
        add("Hello", "Ahoj");
    }
    
    public String get(String word) {
        return this.translations.get(word);
        
    }
    public void add(String word, String translation) {
        this.translations.put(word, translation);
    }
    public String randomWord() {
        System.out.println(this.translations.keySet().size());
        if(this.translations.keySet().isEmpty()) {
            return null;
        }
        
        return (String)this.translations.keySet().toArray()[new Random().nextInt(this.translations.keySet().size())];
    }
    
}
