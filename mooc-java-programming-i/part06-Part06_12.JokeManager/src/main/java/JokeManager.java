
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shota
 */
public class JokeManager {
    private ArrayList<String> list;
    
    public JokeManager() {
        this.list = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        this.list.add(joke);
    }
    
    public String drawJoke(){
        if (list.isEmpty()) {
            return null;
        }
        
        Random draw = new Random();
        int index = draw.nextInt(list.size());
        
        return list.get(index);
    }
    
    public void printJokes() {
        for (String joke: list) {
            System.out.println(joke);
        }
    }
}
