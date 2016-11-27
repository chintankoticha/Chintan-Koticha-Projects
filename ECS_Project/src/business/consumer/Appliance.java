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
public class Appliance {
    private String applianceId;
    private String applianceName;
    private SensorDirectory sensorDirectory;
    
    public enum Type{
        Automobile("Automobile Appliance"), Refrigerator("Refrigerator Appliance"), AC("Ac Appliance");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }


    public Appliance(String name){
        this.applianceName=name;
        sensorDirectory = new SensorDirectory();
    }

    
    public String getApplianceId() {
        return applianceId;
    }

    public void setApplianceId(String applianceId) {
        this.applianceId = applianceId;
    }

    public String getApplianceName() {
        return applianceName;
    }

    public void setApplianceName(String applianceName) {
        this.applianceName = applianceName;
    }

    public SensorDirectory getSensorDirectory() {
        return sensorDirectory;
    }

    public void setSensorDirectory(SensorDirectory sensorDirectory) {
        this.sensorDirectory = sensorDirectory;
    }   
}