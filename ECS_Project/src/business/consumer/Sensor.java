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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCurrentEmissionCO2() {
        return currentEmissionCO2;
    }

    public void setCurrentEmissionCO2(int currentEmissionCO2) {
        this.currentEmissionCO2 = currentEmissionCO2;
    }  

    public int getCurrentEmissionNOx() {
        return currentEmissionNOx;
    }

    public void setCurrentEmissionNOx(int currentEmissionNOx) {
        this.currentEmissionNOx = currentEmissionNOx;
    }
    
}