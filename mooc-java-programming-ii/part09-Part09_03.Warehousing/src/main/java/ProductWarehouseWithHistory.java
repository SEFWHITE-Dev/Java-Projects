/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shota
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    
    private ChangeHistory hist = new ChangeHistory();
    
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        
        hist.add(initialBalance);
        super.addToWarehouse(initialBalance);
    } 
    
    public String history() {
        return this.hist.toString();
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.hist.add(getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount){
        double taken = super.takeFromWarehouse(amount);
        this.hist.add(getBalance());
        return taken;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + this.hist.maxValue());
        System.out.println("Smallest amount of product: " + this.hist.minValue());
        System.out.println("Average: " +  this.hist.average());
    }
}
