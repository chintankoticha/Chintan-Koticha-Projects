/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.consumer;

import java.util.ArrayList;

/**
 *
 * @author Chintan
 */
public class AutomobileDirectory {
    private ArrayList<Automobile> automobileList;

    public AutomobileDirectory() {
        automobileList =  new ArrayList<>();
    }

    public void setAutomobileList(ArrayList<Automobile> automobileList) {
        this.automobileList = automobileList;
    }

    public ArrayList<Automobile> getAutomobileList() {
        return automobileList;
    }    
}