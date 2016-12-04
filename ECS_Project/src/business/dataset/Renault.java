/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.dataset;

import java.util.NavigableMap;
import java.util.TreeMap;

/**
 *
 * @author Siddhant
 */
public class Renault {

    public static Emission initializeEmission(Emission emission, Double sensorCurrentReadingOutput) {
        int ngc;
        // Renault Captur 1.25--> Co2
        NavigableMap<Double, Double> map1 = new TreeMap<Double, Double>();
        map1.put(0.00, 2.19);
        map1.put(2.20, 0.42);
        

        Double map1_co2Count = map1.get(map1.floorKey(sensorCurrentReadingOutput));
        ngc = 33;

        // Renault Captur 1.25--> Nox+pms
        NavigableMap<Double, Double> map2 = new TreeMap<Double, Double>();
        map2.put(0.00, 3.28);
        map2.put(3.25, 1.11);
        map2.put(4.30, 1.02);

        Double map1_nox_pms = map2.get(map2.floorKey(sensorCurrentReadingOutput));
        ngc = 33;

        // Renault Clio--> Co2
        NavigableMap<Double, Double> map3 = new TreeMap<Double, Double>();
        map3.put(0.00, 2.06);
        map3.put(2.10, 0.40);
                
        Double map3_co2Count = map3.get(map3.floorKey(sensorCurrentReadingOutput));
        ngc = 30;

        // Renault Clio--> Nox
        NavigableMap<Double, Double> map4 = new TreeMap<Double, Double>();
        map4.put(0.00, 2.66 );
        map4.put(2.75, 1.05);
        map4.put(3.80, 0.93);

        Double map4_nox_pms = map4.get(map4.floorKey(sensorCurrentReadingOutput));
        ngc = 30;

        // Renault Megane --> Co2
        NavigableMap<Double, Double> map5 = new TreeMap<Double, Double>();
        map5.put(0.00, 3.89);
        map5.put(3.90, 0.58);
        map5.put(4.5, 0.42);

        Double map5_co2Count = map5.get(map5.floorKey(sensorCurrentReadingOutput));
        ngc = 55;

        // Renault Megane --> Nox
        NavigableMap<Double, Double> map6 = new TreeMap<Double, Double>();
        map6.put(0.00, 2.42);
        map6.put(2.90, 1.20);
       
        Double map6_nox_pms = map6.get(map6.floorKey(sensorCurrentReadingOutput));
        ngc = 55;

        // Renault Grand Scenic --> Co2
        NavigableMap<Double, Double> map7 = new TreeMap<Double, Double>();
        map7.put(0.00, 2.06);
        map7.put(2.00, 0.54);
        map7.put(2.50,0.47);

        Double map7_co2Count = map7.get(map7.floorKey(sensorCurrentReadingOutput));
        ngc = 34;

        // Toyota Auris 1.8--> Nox
        NavigableMap<Double, Double> map8 = new TreeMap<Double, Double>();
        map8.put(0.00, 4.60);
        map8.put(4.50, 1.05);
        map8.put(4.70, 0.80);
        

        Double map8_nox_pms = map8.get(map8.floorKey(sensorCurrentReadingOutput));
        ngc = 34;

        return emission;
    }

}
