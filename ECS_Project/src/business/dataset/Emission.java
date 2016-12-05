/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.dataset;

/**
 *
 * @author Siddhant
 */
public class Emission {
    
    private int ngc;
    private Double co2Count;
    private Double nox_pms;

    public int getNgc() {
        return ngc;
    }

    public void setNgc(int ngc) {
        this.ngc = ngc;
    }

    public Double getCo2Count() {
        return co2Count;
    }

    public void setCo2Count(Double co2Count) {
        this.co2Count = co2Count;
    }

    public Double getNox_pms() {
        return nox_pms;
    }

    public void setNox_pms(Double nox_pms) {
        this.nox_pms = nox_pms;
    }
    
    
    
}
