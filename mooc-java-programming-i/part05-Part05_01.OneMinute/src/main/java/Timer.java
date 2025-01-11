/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shota
 */
public class Timer {
    private int seconds;
    private int miliSeconds;
    private int miliLimit = 100;
    private int secondsLimit = 60;
    
    public Timer() {
        this.seconds = 0;
        this.miliSeconds = 0;
        
    }
    
    public void advance(){
        this.miliSeconds += 1;
        
        if (this.miliSeconds >= this.miliLimit) {
            this.miliSeconds = 0;
            
            this.seconds += 1;
        }
        
        if (this.seconds >= secondsLimit) {
            this.seconds = 0;
        }
    }
    
    public String toString() {
        String secondsString = "";
        String miliSecondsString = "";
        
        if (this.seconds <= 10) {
            secondsString = "0" + this.seconds;            
        } else {
            secondsString = ""+ this.seconds;       
        }
        
        if (this.miliSeconds <= 10) {
            miliSecondsString = "0" + this.miliSeconds;
        } else {
            miliSecondsString = ""+ this.miliSeconds;       
        }
        
        return secondsString + ":" + miliSecondsString;
    }
}
