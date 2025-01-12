
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
public class Suitcase {
    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;
    //private int currentWeight;
    
    public Suitcase(int w) {
        this.maxWeight = w;
    }
    
    public void addItem(Item item) {
        int currentWeight = 0;
        
        for (Item i: items) {
            currentWeight += i.getWeight();
        }  
        
        if (item.getWeight() + currentWeight > maxWeight) {
            return;
        }
        this.items.add(item);
        //this.currentWeight += item.getWeight();
    }
    
    public String toString() {

        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        String returnStatement = "";
        int currentWeight = 0;
        
        for (Item item: items) {
            currentWeight += item.getWeight();
        }  
        
        if (items.size() == 1) {
            returnStatement = items.size() + " item ("+ currentWeight + " kg)";
        } else {
            returnStatement = items.size() + " items ("+ currentWeight + " kg)";
        }
        
        
        return returnStatement;
    }
    
    public void printItems() {
        for (Item item: items) {
            System.out.println(item);    
        }   
    }
    
    public int totalWeight() {
        int currentWeight = 0;
        
        for (Item item: items) {
            currentWeight += item.getWeight();
        }  
        
        return currentWeight;
    }
    
    public Item heaviestItem() {
        
        if (items.isEmpty()) {
            return null;
        }
        
        Item temp = items.get(0);
        int weight = items.get(0).getWeight();
        
        for (Item item: items) {
            if(weight < item.getWeight()) {
                temp = item;
                weight = item.getWeight();
            }
        }  
        
        return temp;
    }
}
