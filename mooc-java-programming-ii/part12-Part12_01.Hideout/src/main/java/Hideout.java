/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shota
 */
public class Hideout<T> {
    
    private T param;

    public Hideout() {
    }
    
    public void putIntoHideout(T toHide) {
        this.param = toHide;
    }
    
    public T takeFromHideout() {
        T copy = this.param;
        
        if (param.equals(null)) {
            return null;
        } else {
            this.param = null;
            return copy;
        }
    }
    
    public boolean isInHideout() {
        if (this.param != null) {
            return true;
        } else {
            return false;
        }
    }
}
