package com.codilla.collections.adv.excercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    @Test
    public void testFindFlightsFrom() {
        //given
        //System.out.println(FlightRepository.getFlightsTable());

        //when
        List<Flight> foundFlightsFrom = FlightFinder.findFlightsFrom("Warszawa");

        //then
        assertEquals(4,foundFlightsFrom.size());
        assertEquals("Warszawa", foundFlightsFrom.get(0).getDeparture());
        assertEquals("Warszawa", foundFlightsFrom.get(1).getDeparture());
        assertEquals("Warszawa", foundFlightsFrom.get(2).getDeparture());
        assertEquals("Warszawa", foundFlightsFrom.get(3).getDeparture());
    }

    @Test
    public void testFindFlightsTo(){
        //given
        //System.out.println(FlightRepository.getFlightsTable());

        //when
        List<Flight> foundFlightsTo = FlightFinder.findFlightsTo("Warszawa");

        //then
        assertEquals(1,foundFlightsTo.size());
        assertEquals("Warszawa", foundFlightsTo.get(0).getArrival());
    }
}