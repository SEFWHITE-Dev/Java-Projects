/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shota
 */
public class Multiplier {
    private int num = 0;
    
    public Multiplier(int number){
        this.num = number;
    }
    
    public int multiply(int number) {
        return this.num * number;
    }
}
