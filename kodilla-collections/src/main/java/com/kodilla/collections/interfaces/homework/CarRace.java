package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford();

        Opel opel = new Opel();

        Audi audi = new Audi();

        doRace(ford);
        doRace(opel);
        doRace(audi);
    }

    public static void doRace(Car car){
        for (int i = 0; i < 3; i++){
            car.increaseSpeed();
        }
        for (int i = 0; i < 2; i++){
            car.decreaseSpeed();
        }
        System.out.println("Final speed: " + car.getSpeed());
    }

}
