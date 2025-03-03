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
    private Education e;

    public Person(String name, Education e) {
        this.name = name;
        this.e = e;
    }
    
    public Education getEducation() {
        return this.e;
    }
    
    public String toString() {
        return this.name + ", " + this.e;
    }
}
