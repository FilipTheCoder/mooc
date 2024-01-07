
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
public class Abbreviations {
    private HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap();
    }
    
    private String sanitizedString(String s) {
        if(s == null) {
            return "";
        }
        return s.toLowerCase().trim();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviation = this.sanitizedString(abbreviation);
        explanation = this.sanitizedString(explanation);
        
        if(this.abbreviations.containsKey(abbreviation)) {
            return;
        }
        this.abbreviations.put(abbreviation, explanation);
        
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviations.containsKey(this.sanitizedString(abbreviation));
    }
    public String findExplanationFor(String abbreviation) {
        return this.abbreviations.get(this.sanitizedString(abbreviation));
    }
    
    
}
