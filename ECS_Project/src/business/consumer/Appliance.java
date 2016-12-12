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
    private int hfcEmission;
    private SensorDirectory sensorDirectory;

    public Appliance(){
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
    
    @Override
    public String toString()
    {
        return applianceName; 
    }
    
    public int hfcEmission(String appliName)
    {
        if(appliName.substring(0,2).equalsIgnoreCase("LG"))
        {
            hfcEmission=20;
        }
        else if(appliName.substring(0, 7).equalsIgnoreCase("SAMSUNG"))
        {
            hfcEmission=15;
        }
        return hfcEmission;
    }
}