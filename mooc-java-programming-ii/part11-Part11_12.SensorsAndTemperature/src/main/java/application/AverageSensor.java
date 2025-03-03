/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shota
 */
public class AverageSensor implements Sensor{

    private boolean isOn = false;
    private ArrayList<Sensor> sensors = new ArrayList<>();
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
//            if (sensor.isOn() == false) {
//                return;
//            }
            sensor.setOn();
        }
        this.isOn = true;
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
//            if (sensor.isOn() == true) {
//                return;
//            }
            sensor.setOff();
        }
        this.isOn = false;
    }

    @Override
    public int read() {
        if (!this.isOn || this.sensors.isEmpty()) {
            throw new IllegalStateException();
        }
        
        int sum = 0;
        
        for (Sensor sensor : sensors) {
            sum += sensor.read();
        }
        sum = sum / sensors.size();
        
        return sum;
    }
    
    public List<Integer> readings() {
        List<Integer> list = new ArrayList<>();
        
        for (Sensor sensor : sensors) {
            list.add(sensor.read());
        }
        
        return list;
    }
    
}
