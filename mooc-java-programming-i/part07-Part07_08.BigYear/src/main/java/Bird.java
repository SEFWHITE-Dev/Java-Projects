/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shota
 */
public class Bird {
    private int seenCount;
    private String name;
    private String nameLatin;
    
    public Bird() {
        
    }
    
    public Bird(int seenCount, String name, String nameLatin) {
        this.seenCount = seenCount;
        this.name = name;
        this.nameLatin = nameLatin;
    }

    public int getSeenCount() {
        return seenCount;
    }

    public String getName() {
        return name;
    }

    public void setSeenCount(int seenCount) {
        this.seenCount = seenCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameLatin(String nameLatin) {
        this.nameLatin = nameLatin;
    }
    
    public String toString() {
        return this.name + " (" + this.nameLatin + "): " + this.seenCount + " observations";
    }
    
    
}
