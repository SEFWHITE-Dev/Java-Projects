/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author shota
 */
public class Word {
    
    private String word1;
    private String word2;

    public Word(String word1, String word2) {
        this.word1 = word1;
        this.word2 = word2;
    }
    
    public String getWord() {
        return this.word1;
    }
    
    public String getTranslation() {
        return this.word2;
    }
}
