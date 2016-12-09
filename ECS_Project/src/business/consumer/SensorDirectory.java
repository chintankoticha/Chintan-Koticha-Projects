/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.consumer;

import java.util.ArrayList;

/**
 *
 * @author Chintan
 */
public class SensorDirectory {
    private ArrayList<Sensor> sensorDirectory;
    
    public SensorDirectory(){
        sensorDirectory = new ArrayList();
    }

    public ArrayList<Sensor> getSensorDirectory() {
        return sensorDirectory;
    }

    public void setSensorDirectory(ArrayList<Sensor> sensorDirectory) {
        this.sensorDirectory = sensorDirectory;
    }
    
    public Sensor addSensor(Sensor sensor)
    {
        sensorDirectory.add(sensor);
        return sensor;
    }
}