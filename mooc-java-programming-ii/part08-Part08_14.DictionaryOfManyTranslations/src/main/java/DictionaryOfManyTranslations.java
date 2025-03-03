
import java.util.ArrayList;
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
public class DictionaryOfManyTranslations {
    
    // String word
    // ArrayList of translations
    private HashMap<String, ArrayList<String>> dic;
    
    public DictionaryOfManyTranslations() {
        dic = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        dic.putIfAbsent(word, new ArrayList<>());
        dic.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word){
        
        return dic.getOrDefault(word, new ArrayList<>());
    }
    
    public void remove(String word){
        dic.remove(word);
    }
    
}
