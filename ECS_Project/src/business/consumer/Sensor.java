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
public class Sensor {
    private String sensorId;
    private String sensorName;
    private String sensorFittedTo;
    private Double sensorCurrentReadingOutput;

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public String getSensorFittedTo() {
        return sensorFittedTo;
    }

    public void setSensorFittedTo(String sensorFittedTo) {
        this.sensorFittedTo = sensorFittedTo;
    }

    public Double getSensorCurrentReadingOutput() {
        return sensorCurrentReadingOutput;
    }

    public void setSensorCurrentReadingOutput(Double sensorCurrentReadingOutput) {
        this.sensorCurrentReadingOutput = sensorCurrentReadingOutput;
    }
    
    
}
