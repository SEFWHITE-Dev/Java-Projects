
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
public class Package {
    
    private ArrayList<Gift> gifts = new ArrayList<>();
    
    public Package() {
        
    }
    
    public void addGift(Gift gift) {
        gifts.add(gift);
    }
    
    public int totalWeight() {
        int total = 0;
        for (Gift gift: gifts){
            total += gift.getWeight();
        }
        return total;
    }
}
