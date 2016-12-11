/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

/**
 *
 * @author Chintan
 */
public class CustomerAlertWorkRequest extends WorkRequest {
    
    private String alertRequest;

    public String getAlertRequest() {
        return alertRequest;
    }

    public void setAlertRequest(String alertRequest) {
        this.alertRequest = alertRequest;
    }
    
}
