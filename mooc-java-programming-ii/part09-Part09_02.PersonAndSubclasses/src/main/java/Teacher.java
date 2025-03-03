/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shota
 */
public class Teacher extends Person{
    
    private int salary = 0;
    
    public Teacher(String name, String addr, int num) {
        super(name, addr);
        
        salary = num;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n  " + "salary " + salary + " euro/month";
    }
}
