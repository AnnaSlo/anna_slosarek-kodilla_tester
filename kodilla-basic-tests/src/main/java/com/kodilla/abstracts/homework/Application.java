package com.kodilla.abstracts.homework;

public class Application {
    public static void main (String [] args) {
        Kolo kolo = new Kolo(2);
        kolo.area();
        kolo.obwod();
        System.out.println("Powierzchnia koła: " + kolo.area() + ", Obwód koła: " + kolo.obwod());

        Kwadrat kwadrat = new Kwadrat (3);
        kwadrat.area();
        kwadrat.obwod();
        System.out.println("Powierzchnia kwadratu: " + kwadrat.area() + ", Obwód kwadratu: " + kwadrat.obwod());

        Trojkat trojkat = new Trojkat (5,2,3,1.5);
        trojkat.area();
        trojkat.obwod();
        System.out.println("Powierzchnia trójkąta: " + trojkat.area() + ", Obwód trójkąta: " + trojkat.obwod());
    }
}
