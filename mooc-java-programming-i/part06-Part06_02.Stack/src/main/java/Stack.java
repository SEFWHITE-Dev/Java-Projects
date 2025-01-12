
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
public class Stack {
    ArrayList<String> list;
    
    public Stack() {
        list = new ArrayList<>();
    }
    
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    public void add(String value){
        list.add(value);
    }
    
    public ArrayList<String> values() {
        return list;
    }
    
    public String take() {
        String value = "";
        int i = list.size() - 1;
        
        value = list.get(i);
        list.remove(i);
        
        return value;
    }
    
}
