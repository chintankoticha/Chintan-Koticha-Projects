/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.consumer;

/**
 *
 * @author Chintan
 */
public class Automobile {
    private String automobileId;
    private String automobileName;
    private SensorDirectory sensorDirectory;

    public Automobile() {
        sensorDirectory = new SensorDirectory();
    }

    public String getAutomobileId() {
        return automobileId;
    }

    public void setAutomobileId(String automobileId) {
        this.automobileId = automobileId;
    }

    public String getAutomobileName() {
        return automobileName;
    }

    public void setAutomobileName(String automobileName) {
        this.automobileName = automobileName;
    }

    public SensorDirectory getSensorDirectory() {
        return sensorDirectory;
    }

    public void setSensorDirectory(SensorDirectory sensorDirectory) {
        this.sensorDirectory = sensorDirectory;
    }
    
    @Override
    public String toString(){
        return automobileName;
    }
}