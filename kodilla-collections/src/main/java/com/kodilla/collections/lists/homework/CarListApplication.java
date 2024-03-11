package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarListApplication {
    public static void main(String[] args) {
        List <Car> cars = new ArrayList<>();
        Opel opel = new Opel(80);
        cars.add(opel);
        cars.add(new Audi(150));
        cars.add(new Ford(100));

        cars.remove(1);
        cars.remove(opel);

        System.out.println(cars.size());

        for (Car car : cars){
        CarUtils.describeCar(car);
        }

    }
}
