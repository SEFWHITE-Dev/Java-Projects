
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shota
 */
public class Abbreviations {
    
    private HashMap<String, String> abbreviations = new HashMap<>();
    
    public Abbreviations() {
        
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviations.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        if (this.abbreviations.get(abbreviation) != null) {
            return true;
        }
        return false;
    }
    
    public String findExplanationFor(String abbreviation) {
        if (hasAbbreviation(abbreviation)) {
            return this.abbreviations.get(abbreviation);
        }
        return null;
    }
}
