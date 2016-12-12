/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.consumer;

import java.util.Date;

/**
 *
 * @author Chintan
 */
public class Sensor {
    private Date date;
    private int currentEmissionCO2;
    private int currentEmissionNOx;
    private int normalCO2;
    private int normalNOx;
    private int solarCurrentEmissionCO2;
    private int solarCurrentEmissionNOx;
    private int solarNormalCO2;
    private int solarNormalNOx;
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNormalCO2() {
        return normalCO2;
    }

    public void setNormalCO2(int normalCO2) {
        this.normalCO2 = normalCO2;
    }

    public int getNormalNOx() {
        return normalNOx;
    }

    public void setNormalNOx(int normalNOx) {
        this.normalNOx = normalNOx;
    }

    public int getCurrentEmissionNOx() {
        return currentEmissionNOx;
    }

    public void setCurrentEmissionNOx(int currentEmissionNOx) {
        this.currentEmissionNOx = currentEmissionNOx;
    }

    public int getCurrentEmissionCO2() {
        return currentEmissionCO2;
    }

    public void setCurrentEmissionCO2(int currentEmissionCO2) {
        this.currentEmissionCO2 = currentEmissionCO2;
    }   

    public int getSolarCurrentEmissionCO2() {
        return solarCurrentEmissionCO2;
    }

    public void setSolarCurrentEmissionCO2(int solarCurrentEmissionCO2) {
        this.solarCurrentEmissionCO2 = solarCurrentEmissionCO2;
    }

    public int getSolarCurrentEmissionNOx() {
        return solarCurrentEmissionNOx;
    }

    public void setSolarCurrentEmissionNOx(int solarCurrentEmissionNOx) {
        this.solarCurrentEmissionNOx = solarCurrentEmissionNOx;
    }

    public int getSolarNormalCO2() {
        return solarNormalCO2;
    }

    public void setSolarNormalCO2(int solarNormalCO2) {
        this.solarNormalCO2 = solarNormalCO2;
    }

    public int getSolarNormalNOx() {
        return solarNormalNOx;
    }

    public void setSolarNormalNOx(int solarNormalNOx) {
        this.solarNormalNOx = solarNormalNOx;
    }
    
    @Override
    public String toString(){
        return date.toString();
    }
}