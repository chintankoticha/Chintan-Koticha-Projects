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
public class BMW {

    public static Emission initializeEmission(Emission emission, Double sensorCurrentReadingOutput) {
        int ngc;
        // BMW Electric Car 123KW Auto--> Co2
        NavigableMap<Double, Double> map1 = new TreeMap<Double, Double>();
        map1.put(0.00, 0.00);
        map1.put(1.00, 1.31);
        map1.put(2.00, 0.49);

        Double map1_co2Count = map1.get(map1.floorKey(sensorCurrentReadingOutput));
        ngc = 23;

        // BMW Electric Car 123KW Auto--> Nox+pms
        NavigableMap<Double, Double> map2 = new TreeMap<Double, Double>();
        map2.put(0.00, 0.00);
        map2.put(1.00, 2.90);
        map2.put(2.00, 0.98);

        Double map1_nox_pms = map2.get(map2.floorKey(sensorCurrentReadingOutput));
        ngc = 23;

        // BMW X1 Sdrive18D SE SUV --> Co2
        NavigableMap<Double, Double> map3 = new TreeMap<Double, Double>();
        map3.put(0.00, 0.00);
        map3.put(2.50, 2.44);
        map3.put(2.80, 0.47);
        map3.put(2.81, 0.45);

        Double map3_co2Count = map3.get(map3.floorKey(sensorCurrentReadingOutput));
        ngc = 37;

        // BMW X1 Sdrive18D SE SUV--> Nox
        NavigableMap<Double, Double> map4 = new TreeMap<Double, Double>();
        map4.put(0.00, 0.00);
        map4.put(3.25, 3.28);
        map4.put(4.50, 1.23);
        map4.put(4.60, 1.25);

        Double map4_nox_pms = map4.get(map4.floorKey(sensorCurrentReadingOutput));
        ngc = 37;

        // BMW M4 Coupe --> Co2
        NavigableMap<Double, Double> map5 = new TreeMap<Double, Double>();
        map5.put(0.00, 4.34);
        map5.put(4.26, 0.75);

        Double map5_co2Count = map5.get(map5.floorKey(sensorCurrentReadingOutput));
        ngc = 61;

        // BMW M4 Coupe --> Nox
        NavigableMap<Double, Double> map6 = new TreeMap<Double, Double>();
        map6.put(0.00, 0.58);
        map6.put(0.60, 2.68);
        map6.put(3.25, 1.34);

        Double map6_nox_pms = map6.get(map6.floorKey(sensorCurrentReadingOutput));
        ngc = 61;

        // BMW M2 Coupe --> Co2
        NavigableMap<Double, Double> map7 = new TreeMap<Double, Double>();
        map7.put(0.00, 4.14);
        map7.put(4.00, 0.71);

        Double map7_co2Count = map7.get(map7.floorKey(sensorCurrentReadingOutput));
        ngc = 58;

        // BMW M4 Coupe --> Nox
        NavigableMap<Double, Double> map8 = new TreeMap<Double, Double>();
        map8.put(0.00, 0.24);
        map8.put(0.20, 2.55);
        map8.put(2.75, 1.32);

        Double map8_nox_pms = map8.get(map8.floorKey(sensorCurrentReadingOutput));
        ngc = 58;

        return emission;
    }

}
