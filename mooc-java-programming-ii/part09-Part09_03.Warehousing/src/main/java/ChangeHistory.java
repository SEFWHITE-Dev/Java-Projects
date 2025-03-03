
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
public class ChangeHistory {
    private ArrayList<Double> list;
    
    public ChangeHistory() {
        list = new ArrayList<>();
    }
    
    public void add(double status) {
        this.list.add(status);
    }
    
    public void clear() {
        this.list.clear();
    }
    
    public double maxValue() {
        if (this.list.isEmpty()) {
            return 0.0;
        }
        
        double temp = 0.0;
        for (Double item : list) {
            if (item > temp) {
                temp = item;
            }
        }
        return temp;
    }
    
    public double minValue() {
        if (this.list.isEmpty()) {
            return 0.0;
        }
        
        double temp = list.get(0);
        for (Double item : list) {
            if (item < temp) {
                temp = item;
            }
        }
        return temp;
    }
    
    public double average() {
        if (this.list.isEmpty()) {
            return 0.0;
        }
        
        double temp = 0.0;
        for (Double item : list) {
            temp += item;
        }
        return temp / list.size();
    }
    
    public String toString() {
        return this.list.toString();
    }
    
}
