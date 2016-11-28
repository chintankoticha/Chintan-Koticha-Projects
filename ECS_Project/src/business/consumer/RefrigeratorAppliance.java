/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.consumer;

/**
 *
 * @author admin
 */
public class RefrigeratorAppliance extends Appliance {
    
      private SensorDirectory sensorDirectory;

    
    @Override
    public SensorDirectory getSensorDirectory() {
        return sensorDirectory;
    }

    @Override
    public void setSensorDirectory(SensorDirectory sensorDirectory) {
        this.sensorDirectory = sensorDirectory;
    }   

    public RefrigeratorAppliance() {
    super(Appliance.Type.Refrigerator.getValue());
    sensorDirectory = new SensorDirectory();
    }
    
}
