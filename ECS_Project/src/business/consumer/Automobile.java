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
    private int co2Emission;
    private int noxEmission;
    private int pmEmission;
    private int battery;
    
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

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
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
    
    public int co2Emission(String autoName)   
    {
        if(autoName.equalsIgnoreCase("BMW i3"))
        {
            co2Emission=13;        
        }
        else if(autoName.equalsIgnoreCase("BMW X1"))
        {
            co2Emission=109;
        }
         else if(autoName.equalsIgnoreCase("BMW M4 COUPE"))
        {
            co2Emission=194;
        }
         else if(autoName.equalsIgnoreCase("BMW M2 COUPE"))
        {
            co2Emission=185;
        }
         else if(autoName.equalsIgnoreCase("HONDA CIVIC"))
        {
            co2Emission=94;
        }
         else if(autoName.equalsIgnoreCase("HONDA CRV"))
        {
            co2Emission=115;
        }
         else if(autoName.equalsIgnoreCase("HONDA HRV"))
        {
            co2Emission=104;
        }
         else if(autoName.equalsIgnoreCase("HONDA CAPTUR"))
        {
            co2Emission=106;
        }
         else if(autoName.equalsIgnoreCase("RENAULT CAPTUR"))
        {
            co2Emission=98;
        }
         else if(autoName.equalsIgnoreCase("RENAULT CLIO"))
        {
            co2Emission=82;
        }
         else if(autoName.equalsIgnoreCase("RENAULT MEGANE"))
        {
            co2Emission=96;
        }
         else if(autoName.equalsIgnoreCase("RENAULT GRAND SCENIC"))
        {
            co2Emission=92;
        }
         else if(autoName.equalsIgnoreCase("TOYOTA PRIUS"))
        {
            co2Emission=72;
        }
         else if(autoName.equalsIgnoreCase("TOYOTA LAND CRUISER"))
        {
            co2Emission=190;
        }
         else if(autoName.equals("TOYOTA VERSO"))
        {
            co2Emission=119;
        }
         else if(autoName.equals("TOYOTA CAMRY"))
        {
            co2Emission=79;
        }
        
        
        return co2Emission;
    }
    
    public int noxEmission(String autoName)
            
    {
        if(autoName.equals("BMW i3"))
        {
            noxEmission=1;
            
        }
        else if(autoName.equals("BMW X1"))
        {
            noxEmission=37;
        }
         else if(autoName.equals("BMW M4 COUPE"))
        {
            noxEmission=36;
        }
         else if(autoName.equals("BMW M2 COUPE"))
        {
            noxEmission=15;
        }
         else if(autoName.equals("HONDA CIVIC"))
        {
            noxEmission=50;
        }
         else if(autoName.equals("HONDA CRV"))
        {
            noxEmission=64;
        }
         else if(autoName.equals("HONDA HRV"))
        {
            noxEmission=69;
        }
         else if(autoName.equalsIgnoreCase("HONDA CAPTUR"))
        {
            noxEmission=3;
        }
         else if(autoName.equals("RENAULT CAPTUR"))
        {
            noxEmission=31;
        }
         else if(autoName.equals("RENAULT CLIO"))
        {
            noxEmission=33;
        }
         else if(autoName.equals("RENAULT MEGANE"))
        {
            noxEmission=34;
        }
         else if(autoName.equals("RENAULT GRAND SCENIC"))
        {
            noxEmission=52;
        }
         else if(autoName.equals("TOYOTA PRIUS"))
        {
            noxEmission=16;
        }
         else if(autoName.equals("TOYOTA LAND CRUISER"))
        {
            noxEmission=41;
        }
         else if(autoName.equals("TOYOTA VERSO"))
        {
            noxEmission=24;
        }
         else if(autoName.equals("TOYOTA CAMRY"))
        {
            noxEmission=6;
        }
        
        
        return noxEmission;
    }
    public int pmEmission(String autoName)
            
    {
        if(autoName.equals("BMW i3"))
        {
            pmEmission=0;
            
        }
        else if(autoName.equals("BMW X1"))
        {
            pmEmission=0;
        }
         else if(autoName.equals("BMW M4 COUPE"))
        {
            pmEmission=0;
        }
         else if(autoName.equals("BMW M2 COUPE"))
        {
            pmEmission=0;
        }
         else if(autoName.equals("HONDA CIVIC"))
        {
            pmEmission=0;
        }
         else if(autoName.equals("HONDA CRV"))
        {
            pmEmission=0;
        }
         else if(autoName.equals("HONDA HRV"))
        {
           pmEmission=0;
        }
         else if(autoName.equals("HONDA JAZZ"))
        {
            pmEmission=0;
        }
         else if(autoName.equals("RENAULT CAPTUR"))
        {
            pmEmission=0;
        }
         else if(autoName.equals("RENAULT CLIO"))
        {
            pmEmission=0;
        }
         else if(autoName.equals("RENAULT MEGANE"))
        {
            pmEmission=0;
        }
         else if(autoName.equals("RENAULT GRAND SCENIC"))
        {
            pmEmission=0;
        }
         else if(autoName.equals("TOYOTA PRIUS"))
        {
           pmEmission=0;
        }
         else if(autoName.equals("TOYOTA LAND CRUISER"))
        {
           pmEmission=0;
        }
         else if(autoName.equals("TOYOTA VERSO"))
        {
           pmEmission=0;
        }
         else if(autoName.equals("TOYOTA CAMRY"))
        {
            pmEmission=0;
        }
        
        
        return pmEmission;
    }
    
}