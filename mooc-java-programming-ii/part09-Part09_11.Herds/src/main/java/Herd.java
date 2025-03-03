
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
public class Herd implements Movable{

    private ArrayList<Movable> list = new ArrayList<>();
    
    public Herd() {
        
    }
    
    public String toString(){
        String values = ""; 
        
        for (Movable i : list) {
            values += i.toString() + "\n";
        }
        return values;
    }
    
    public void addToHerd(Movable movable){
        list.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable i : list) {
            i.move(dx, dy);
        }
    }
    
}
