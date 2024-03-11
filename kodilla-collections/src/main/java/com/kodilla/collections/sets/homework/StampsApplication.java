package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("XYZ", 10.0,10.0,true));
        stamps.add(new Stamp("ABC", 5.0, 7.0, false));
        stamps.add(new Stamp("DEF", 3.0, 5.0, true));
        stamps.add(new Stamp("XYZ", 10.0,10.0,true));

        System.out.println(stamps.size());
        System.out.println(stamps);

    }
}
