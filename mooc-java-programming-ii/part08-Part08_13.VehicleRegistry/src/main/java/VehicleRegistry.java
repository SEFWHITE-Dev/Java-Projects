
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shota
 */
public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> reg;
    
    public VehicleRegistry() {
        this.reg = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (!reg.containsKey(licensePlate)) {
            this.reg.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate) {
        
        return reg.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (reg.containsKey(licensePlate)) {
            reg.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates() {
        for (LicensePlate r : reg.keySet()) { 
            System.out.println(r.toString());
        }
    }
    
    public void printOwners() {
        ArrayList<String> names = new ArrayList<>();
        
        for (String r : reg.values()) { 
            //System.out.println("PRINTING: " + reg.values());
            if (names == null) {
                names.add(r);
            }
            if (!names.contains(r)) {
                names.add(r);
            }
        }
        
        for (String name : names) {
            System.out.println(name);
        }
    }
}
