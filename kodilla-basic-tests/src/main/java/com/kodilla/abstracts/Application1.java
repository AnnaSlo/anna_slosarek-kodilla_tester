package com.kodilla.abstracts;

public class Application1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.giveVoice();

        Duck duck = new Duck();
        duck.giveVoice();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);
        processor.process(duck);
    }
}
