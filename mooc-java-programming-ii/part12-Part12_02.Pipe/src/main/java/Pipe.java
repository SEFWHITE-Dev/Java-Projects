
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
public class Pipe<T> {
    
    ArrayList<T> list = new ArrayList<>();
    
    public Pipe(){
        
    }
    
    public void putIntoPipe(T value) {
        this.list.add(0, value);
    }
    
    public T takeFromPipe() {
        if (this.list.isEmpty()) {
            return null;
        }
        
        T item = list.get(list.size()-1);
        list.remove(list.size()-1);
        
        return item;
    }
    
    public boolean isInPipe() {
        if (this.list.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
