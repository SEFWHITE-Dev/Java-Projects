
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
public class Room {
    ArrayList<Person> persons = new ArrayList<>();
    
    public Room() {
    
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty(){
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        if (this.isEmpty()){
            return null;
        }
        
        int height = persons.get(0).getHeight();
        Person temp = persons.get(0);
        
        
        for (Person person: persons){
            if(person.getHeight() < height) {
                height = person.getHeight();
                temp = person;
            }
        }
        
        return temp;
    }
    
    public Person take() {
        if (this.isEmpty()){
            return null;
        }
        // print shortest, remove them from list
        Person temp = this.shortest();
        
        if (persons.contains(temp)){
            persons.remove(temp);
        }
        
        return temp;
    }
}
