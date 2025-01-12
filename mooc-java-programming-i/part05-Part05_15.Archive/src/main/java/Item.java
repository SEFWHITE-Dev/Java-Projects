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
    private String id;
    private String name;
    
    public Item() {
        this.id = "";
        this.name = "";
    }
    
    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public boolean compareId(Item input) {
        if (this.id.equals(input.id)) {
            return true;
        } else {
            return false;
        }
    }
    
    public String toString(){
        return this.id + ": " + this.name;
    }
}
