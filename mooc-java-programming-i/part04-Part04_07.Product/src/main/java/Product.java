/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shota
 */
public class Product {
    private double price;
    private int quantity;
    private String name;
    
    public Product (String initialName, double initialPrice, int initialQuantity){
        name = initialName;
        price = initialPrice;
        quantity = initialQuantity;
    } 
    
    public void printProduct() {
        System.out.println(this.name +", price "+ this.price +", "+this.quantity + " pcs" );
    }
    
}
