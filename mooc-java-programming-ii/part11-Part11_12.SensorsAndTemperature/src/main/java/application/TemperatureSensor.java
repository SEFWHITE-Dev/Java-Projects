/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author shota
 */
public class TemperatureSensor implements Sensor{
    
    private boolean isOn = false;

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void setOn() {
        this.isOn = true;
    }

    @Override
    public void setOff() {
        this.isOn = false;
    }

    @Override
    public int read() {
        int value = 0;
        
        if (this.isOn) {
            value = new Random().nextInt(31) - new Random().nextInt(31);
        } else {
            throw new IllegalStateException();
        }
        
        return value;
    }
    
}
