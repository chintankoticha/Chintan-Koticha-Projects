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
public class Toyota {

    public static Emission initializeEmission(Emission emission, Double sensorCurrentReadingOutput) {
        int ngc;
        // Toyota Land Cruiser--> Co2
        NavigableMap<Double, Double> map1 = new TreeMap<Double, Double>();
        map1.put(0.00, 4.25);
        map1.put(4.25, 0.82);
        map1.put(5.00, 0.62);

        Double map1_co2Count = map1.get(map1.floorKey(sensorCurrentReadingOutput));
        ngc = 60;

        // Toyota Land Cruiser--> Nox+pms
        NavigableMap<Double, Double> map2 = new TreeMap<Double, Double>();
        map2.put(0.00, 3.63);
        map2.put(3.75, 2.15);
        map2.put(5.75, 1.72);

        Double map1_nox_pms = map2.get(map2.floorKey(sensorCurrentReadingOutput));
        ngc = 60;

        // Toyota Prius--> Co2
        NavigableMap<Double, Double> map3 = new TreeMap<Double, Double>();
        map3.put(0.00, 1.57);
        map3.put(1.50, 1.27);
        map3.put(1.75, 0.50);
        
        Double map3_co2Count = map3.get(map3.floorKey(sensorCurrentReadingOutput));
        ngc = 27;

        // Toyota Prius--> Nox
        NavigableMap<Double, Double> map4 = new TreeMap<Double, Double>();
        map4.put(0.00, 0.26);
        map4.put(0.25, 0.97);
        map4.put(1.25, 1.24);

        Double map4_nox_pms = map4.get(map4.floorKey(sensorCurrentReadingOutput));
        ngc = 27;

        // Toyota Verso --> Co2
        NavigableMap<Double, Double> map5 = new TreeMap<Double, Double>();
        map5.put(0.00, 3.42);
        map5.put(3.50, 0.49);
        map5.put(4.00, 0.44);

        Double map5_co2Count = map5.get(map5.floorKey(sensorCurrentReadingOutput));
        ngc = 49;

        // Toyota Verso --> Nox
        NavigableMap<Double, Double> map6 = new TreeMap<Double, Double>();
        map6.put(0.00, 0.23);
        map6.put(0.20, 2.13);
        map6.put(2.25, 1.26);

        Double map6_nox_pms = map6.get(map6.floorKey(sensorCurrentReadingOutput));
        ngc = 49;

        // Toyota Auris 1.8 --> Co2
        NavigableMap<Double, Double> map7 = new TreeMap<Double, Double>();
        map7.put(0.00, 1.77);
        map7.put(1.75, 0.32);
        map7.put(2.10,0.52);

        Double map7_co2Count = map7.get(map7.floorKey(sensorCurrentReadingOutput));
        ngc = 30;

        // Toyota Auris 1.8--> Nox
        NavigableMap<Double, Double> map8 = new TreeMap<Double, Double>();
        map8.put(0.00, 1.13);
        map8.put(1.25, 1.38);
        

        Double map8_nox_pms = map8.get(map8.floorKey(sensorCurrentReadingOutput));
        ngc = 30;

        return emission;
    }

}
