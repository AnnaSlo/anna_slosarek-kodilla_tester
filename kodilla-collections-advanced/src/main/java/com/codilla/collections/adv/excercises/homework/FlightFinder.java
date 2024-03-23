package com.codilla.collections.adv.excercises.homework;

import java.util.ArrayList;
import java.util.List;
public class FlightFinder {
    public static void main(String[] args) {
//        System.out.println(findFlightsFrom("Warszawa"));
//        System.out.println(findFlightsTo("Londyn"));
    }

    public static List<Flight> findFlightsFrom(String departure){
       List<Flight> allFlights = FlightRepository.getFlightsTable();
       List<Flight> foundFlightsFrom = new ArrayList<>();
       for (Flight flight : allFlights){
           if(flight.getDeparture().equals(departure))
               foundFlightsFrom.add(flight);
       }
       return foundFlightsFrom;
   }

   public static List<Flight> findFlightsTo(String arrival){
    List<Flight> allFlights = FlightRepository.getFlightsTable();
    List<Flight> foundFlightsTo = new ArrayList<>();
       for (Flight flight : allFlights){
        if(flight.getArrival().equals(arrival))
            foundFlightsTo.add(flight);
    }
       return foundFlightsTo;
    }
}