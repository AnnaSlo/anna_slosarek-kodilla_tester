package com.codilla.collections.adv.excercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public FlightRepository() {}

    public static List<Flight> getFlightsTable(){
        List<Flight> flights = new ArrayList<>();

        flights.add(new Flight("Warszawa", "Berlin"));
        flights.add(new Flight("Kraków", "Londyn"));
        flights.add(new Flight("Katowice","Zurich"));
        flights.add(new Flight("Warszawa", "Londyn"));
        flights.add(new Flight("Warszawa", "Berlin"));
        flights.add(new Flight("Kraków", "Warszawa"));
        flights.add(new Flight("Warszawa","Paryż"));

        return flights;
    }

}
