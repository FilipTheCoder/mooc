
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author filip
 */
public class StorageFacility {

    private final HashMap<String, ArrayList<String>> storage = new HashMap();

    public void add(String unit, String item) {
        if (storage.containsKey(unit)) {
            storage.get(unit).add(item);
        } else {
            storage.put(unit, new ArrayList(Collections.singletonList(item)));
        }
    }

    public ArrayList<String> contents(String storageUnit) {
        if (storage.containsKey(storageUnit)) {
            return (ArrayList<String>)storage.get(storageUnit).clone();
        } else {
            return new ArrayList();
        }
    }
    public void remove(String storageUnit, String item) {
        if(!storage.containsKey(storageUnit)) {
            return;
        }
        ArrayList<String> unit = storage.get(storageUnit);
        unit.remove(item);
        if(unit.isEmpty()) {
            storage.remove(storageUnit);
        }
    }
    public ArrayList<String> storageUnits() {
        ArrayList<String> names = new ArrayList();
        for(String unit : storage.keySet()) {
            if(!unit.isEmpty()) {
                names.add(unit);
            }
        }
        return names;
    }
}
