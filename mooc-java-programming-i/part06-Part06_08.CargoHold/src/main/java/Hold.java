
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shota
 */
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    
    public Hold(int w) {
        this.maxWeight = w;
    }
    
    public void addSuitcase(Suitcase suitcase){
        int currentWeight = 0;
        
        for (Suitcase s: suitcases) {
            currentWeight += s.totalWeight();
        }   
        
        if (suitcase.totalWeight() + currentWeight > maxWeight) {
            return;
        }
        
        this.suitcases.add(suitcase);
    }
    
    public String toString() {
        int currentWeight = 0;
        
        for (Suitcase s: suitcases) {
            currentWeight += s.totalWeight();
        }  
        
        return this.suitcases.size() + " suitcases (" + currentWeight +" kg)";
    }
    
    public void printItems() {
        for (Suitcase s: suitcases) {
            s.printItems();
        } 
    }
}
