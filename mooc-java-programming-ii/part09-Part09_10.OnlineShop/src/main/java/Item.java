/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shota
 */
public class Item {
    
    private String name;
    private int amount;
    private int price;
    
    public Item(String product, int qty, int unitPrice) {
        this.name = product;
        this.amount = qty;
        this.price = unitPrice;
    }
    
    public int price(){
        return this.price * this.amount;
    }
    
    public void increaseQuantity() {
        this.amount += 1;
    }
    
    @Override
    public String toString() {
        return this.name + ": " + this.amount;
    }
}
