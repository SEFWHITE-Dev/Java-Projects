/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shota
 */
public class Book {
    private String title;
    private int pages;
    private int pubYear;
    
    public Book(String t, int p, int py) {
        this.title = t;
        this.pages = p;
        this.pubYear = py;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public int getPages() {
        return this.pages;
    }
    
    public int getPubYear() {
        return this.pubYear;
    }
    
    @Override
    public String toString() {
        return this.title + ", " + this.pages + ", " + this.pubYear;
    }
}
