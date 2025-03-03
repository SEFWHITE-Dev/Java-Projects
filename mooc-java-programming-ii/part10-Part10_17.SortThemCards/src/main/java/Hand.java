
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shota
 */
public class Hand implements Comparable<Hand>{
    
    private ArrayList<Card> list = new ArrayList<>();
    
    public Hand() {
        
    }
    
    public void add(Card card) {
        this.list.add(card);
    }
    
    public void print() {
        Iterator<Card> it = list.iterator();
        
        while (it.hasNext()) {
            Card c = it.next();
            System.out.println(c.toString());
        }
    }
    
    public void sort() {
        this.list.sort(null);
    }
    
    public int sumValue() {
        return this.list.stream().mapToInt(Card::getValue).sum();
    }

    @Override
    public int compareTo(Hand obj) {
        return Integer.compare(this.sumValue(), obj.sumValue());
    }
    
    public void sortBySuit() {
        Collections.sort(list, (c1, c2) -> c1.getSuit().ordinal() - c2.getSuit().ordinal());
    }
    
}
