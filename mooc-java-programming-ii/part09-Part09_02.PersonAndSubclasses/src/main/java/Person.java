
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shota
 */
public class Person {
    
    private String name;
    private String address;
    
   // private HashMap<String, String> person = new HashMap<>();
    
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        
    //    person.put(name, address);
    }
    
    public String toString() {
        return name + "\n  " + address;
    }
    
}
