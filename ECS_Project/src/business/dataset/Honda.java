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
public class Honda {

    public static Emission initializeEmission(Emission emission, Double sensorCurrentReadingOutput) {
        int ngc;
        // Honda Civic--> Co2
        NavigableMap<Double, Double> map1 = new TreeMap<Double, Double>();
        map1.put(0.00, 2.19);
        map1.put(2.20, 0.42);
        map1.put(2.60, 0.40);
        

        Double map1_co2Count = map1.get(map1.floorKey(sensorCurrentReadingOutput));
        ngc = 34;

        // Renault Captur 1.25--> Nox+pms
        NavigableMap<Double, Double> map2 = new TreeMap<Double, Double>();
        map2.put(0.00, 4.43);
        map2.put(4.20, 1.11);
        map2.put(5.50, 1.12);

        Double map1_nox_pms = map2.get(map2.floorKey(sensorCurrentReadingOutput));
        ngc = 34;

        // Honda CRV--> Co2
        NavigableMap<Double, Double> map3 = new TreeMap<Double, Double>();
        map3.put(0.00, 2.89);
        map3.put(2.90, 0.56);
        map3.put(3.50, 0.50);
                
        Double map3_co2Count = map3.get(map3.floorKey(sensorCurrentReadingOutput));
        ngc = 44;

        // Honda CRV--> Nox
        NavigableMap<Double, Double> map4 = new TreeMap<Double, Double>();
        map4.put(0.00, 6.46);
        map4.put(6.50, 1.46);
        map4.put(8.00, 1.39);

        Double map4_nox_pms = map4.get(map4.floorKey(sensorCurrentReadingOutput));
        ngc = 44;

        // Honda HRV --> Co2
        NavigableMap<Double, Double> map5 = new TreeMap<Double, Double>();
        map5.put(0.00, 2.33);
        map5.put(2.20, 0.46);
        map5.put(2.75, 0.43);

        Double map5_co2Count = map5.get(map5.floorKey(sensorCurrentReadingOutput));
        ngc = 37;

        // Honda HRV --> Nox
        NavigableMap<Double, Double> map6 = new TreeMap<Double, Double>();
        map6.put(0.00, 6.11);
        map6.put(6.00, 1.20);
       
        Double map6_nox_pms = map6.get(map6.floorKey(sensorCurrentReadingOutput));
        ngc = 37;

        // Honda Jazz --> Co2
        NavigableMap<Double, Double> map7 = new TreeMap<Double, Double>();
        map7.put(0.00, 2.48);
        map7.put(2.50, 0.43);
        map7.put(2.75,0.33);

        Double map7_co2Count = map7.get(map7.floorKey(sensorCurrentReadingOutput));
        ngc = 36;

        // Honda Jazz--> Nox
        NavigableMap<Double, Double> map8 = new TreeMap<Double, Double>();
        map8.put(0.00, 1.55);
        map8.put(1.50, 1.95);    

        Double map8_nox_pms = map8.get(map8.floorKey(sensorCurrentReadingOutput));
        ngc = 36;

        return emission;
    }

}
