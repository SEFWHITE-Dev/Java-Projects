
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
public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility() {
        storage = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        storage.putIfAbsent(unit, new ArrayList<>());
        storage.get(unit).add(item);
        //System.out.println(storage.get(unit));
    }
    
    public ArrayList<String> contents(String storageUnit) {
        
        if (!storage.containsKey(storageUnit)) {
            return new ArrayList<>();
        }
        
        //return storage.getOrDefault(storage.get(storageUnit), new ArrayList<>());
        return storage.get(storageUnit);
    }
    
    public void remove(String storageUnit, String item) {
        if (!storage.containsKey(storageUnit)) {
            return;
        }
        storage.get(storageUnit).remove(item);
        
        if (storage.get(storageUnit).isEmpty()) {
            storage.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        return new ArrayList<>(storage.keySet());
    }
    
}
