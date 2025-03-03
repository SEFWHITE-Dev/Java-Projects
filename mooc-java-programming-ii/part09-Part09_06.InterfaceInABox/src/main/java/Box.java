
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
public class Box implements Packable{
    
    private ArrayList<Packable> items = new ArrayList<>();
    
    private double maxCapacity;
    
    public Box(double weight) {
        this.maxCapacity = weight;
    }
    
    
    public void add(Packable input) {
        double weight = 0;
        for (Packable i: this.items) {
            weight += i.weight();
        }
        
        if(this.maxCapacity >= input.weight() + weight) {
            this.items.add(input);
        }
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable i: this.items) {
            weight += i.weight();
        }
        return weight;
    }
    
    @Override
    public String toString(){
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
    
}
