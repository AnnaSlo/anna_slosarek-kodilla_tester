package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random random = new Random();
        int carCounts = random.nextInt(13);

        Car[] cars = new Car[carCounts];
        for (int i = 0; i < cars.length; i++){
            cars[i] = drawCar();
        }

        for (Car c: cars) {
            CarUtils.describeCar(c);
        }
    }

    public static Car drawCar(){
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);
        int a = getRandomSpeed(random);
        if (drawnCarKind == 0) {
            return new Opel(a);
        }
        else if (drawnCarKind == 1) {
            return new Ford(a);
        }
        else {
            return new Audi(a);
        }

    }

    private static int getRandomSpeed (Random random) {
        return random.nextInt(250);
    }
}
