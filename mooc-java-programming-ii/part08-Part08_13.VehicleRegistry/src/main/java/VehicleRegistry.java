
import java.util.ArrayList;
import java.util.Collection;
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
public class VehicleRegistry {

    private HashMap<LicensePlate, String> registery = new HashMap();
    

    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.registery.get(licensePlate) == null) {
            this.registery.put(licensePlate, owner);
            return true;
        }
        
        return false;
    }

    public String get(LicensePlate licensePlate) {
        return this.registery.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        return this.registery.remove(licensePlate) != null;

    }

    public void printLicensePlates() {
        for (LicensePlate plate : this.registery.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        Collection<String> values = this.registery.values();
        ArrayList<String> owners = new ArrayList();
        for (String owner : values) {
            if(!owners.contains(owner)) {
                System.out.println(owner);
                owners.add(owner);
            }
            
            
        }
    }
}
