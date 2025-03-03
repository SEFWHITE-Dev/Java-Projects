/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shota
 */
public class TripleTacoBox implements TacoBox{
    
    int tacos = 0;
    
    public TripleTacoBox() {
        this.tacos = 3;
    }

    @Override
    public int tacosRemaining() {
        return this.tacos;
    }

    @Override
    public void eat() {
        this.tacos -= 1;
        if (this.tacos <= 0) {
            this.tacos = 0;
        }
    }
    
}
