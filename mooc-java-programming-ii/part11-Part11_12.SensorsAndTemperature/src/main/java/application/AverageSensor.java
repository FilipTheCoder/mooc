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
 * @author filip
 */
public class AverageSensor implements Sensor {
    private final ArrayList<Sensor> sensors = new ArrayList();
    private List<Integer> readings = new ArrayList();
    

    public void addSensor(Sensor toAdd)  {
        sensors.add(toAdd);
    }
    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if(!sensor.isOn()) {
                return false;
            }
                  
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }

    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
            break;
        }

    }

    @Override
    public int read() throws IllegalStateException{
        if(!this.isOn() || sensors.size() == 0) {
            throw new IllegalStateException();
        }
        int sum = 0;
        
        for (Sensor sensor : sensors) {
            sum += sensor.read();
        }
        readings.add(sum / sensors.size());
        return sum / sensors.size();
        
    }
    public List<Integer> readings() {
        return readings;
    }
    
}
