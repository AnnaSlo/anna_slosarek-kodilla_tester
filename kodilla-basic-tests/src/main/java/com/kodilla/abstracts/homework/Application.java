package com.kodilla.abstracts.homework;

public class Application {
    public static void main (String [] args) {
        Kolo kolo = new Kolo();
        kolo.area();
        kolo.obwod();

        Kwadrat kwadrat = new Kwadrat ();
        kwadrat.area();
        kwadrat.obwod();

        Trojkat trojkat = new Trojkat ();
        trojkat.area();
        trojkat.obwod();

    }
}
