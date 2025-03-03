
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
public class BoxWithMaxWeight extends Box{
    

    private int maxWeight;
    private ArrayList<Item> items = new ArrayList<>();

    public BoxWithMaxWeight(int capacity){
        this.maxWeight = capacity;
    }
            
    @Override
    public void add(Item item) {
        int totalWeight = 0;
        for(Item i: items) {
            totalWeight += i.getWeight();
        }
        if (item.getWeight() + totalWeight <= maxWeight) {
            items.add(item);

        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (items.contains(item)) {
            return true;
        }
        return false;
    }
    
}
