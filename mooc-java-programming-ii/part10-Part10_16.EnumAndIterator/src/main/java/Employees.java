
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shota
 */
public class Employees {
    
    private List<Person> list = new ArrayList<>();
    
    public Employees() {
        
    }
    
    public void add(Person personToAdd){
        this.list.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        this.list.addAll(peopleToAdd);
    }
    
    public void print() {
        //this.list.forEach(System.out::println);
        Iterator<Person> it = list.iterator();
        
        while (it.hasNext()) {
            Person p = it.next();
            System.out.println(p.toString());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> it = list.iterator();
        
        while (it.hasNext()) {
            Person p = it.next();
            if (p.getEducation() == education) {
                System.out.println(p.toString());
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> it = list.iterator();
        
        while (it.hasNext()) {
            Person p = it.next();
            if (p.getEducation() == education) {
                it.remove();
            }
        }
    }
}
