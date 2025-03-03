
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shota
 */
public class ShoppingCart {
    
    private List<Item> cart = new ArrayList<>();
    
    public ShoppingCart() {
        
    }
    
    public void add(String product, int price) {
        
        for (Item i : this.cart) {
            if(i.toString().contains(product)) {
                i.increaseQuantity();
                return;
            }
        }
        
        this.cart.add(new Item(product, 1, price));
    }
    
    public int price() {
        int total = 0;
        for (Item i : this.cart) {
            total += i.price();
        }
        return total;
    }
    
    public void print() {
        for (Item i : this.cart) {
            System.out.println(i.toString());
        }
    }
}
