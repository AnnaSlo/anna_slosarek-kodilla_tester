package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {
    public static void describeCar(Car car){
        System.out.println("---------------------------------");
        System.out.println("Rodzaj samochodu: " + getCarKind(car));
        System.out.println("Prędkość samochodu: " + car.getSpeed());
    }

    private static String getCarKind(Car car){
        if (car instanceof Audi) {
            return "Audi";
        }
        else if (car instanceof Ford){
            return "Ford";
        }
        else if (car instanceof Opel){
            return "Opel";
        }
        else {
            return "Unknown car kind";
        }
    }
}
