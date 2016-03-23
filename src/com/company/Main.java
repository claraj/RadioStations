package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Station kfai = new Station("KFAI", 90.3);
        Station radioK = new Station("Radio K", 100.7);
        Station mnPublicRadio = new Station("MPR", 91.1);

        ArrayList<Station> stations = new ArrayList<Station>();

        stations.add(kfai);
        stations.add(radioK);
        stations.add(mnPublicRadio);

        Collections.sort(stations);

        System.out.println("All radio stations, in ascending frequency order");
        System.out.println(stations);
    }
}
