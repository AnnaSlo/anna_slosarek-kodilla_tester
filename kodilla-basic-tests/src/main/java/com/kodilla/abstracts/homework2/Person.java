package com.kodilla.abstracts.homework2;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job){
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void displayResponsibilities(){
        System.out.println("Responsibilities of " + firstName + " are: " + job.getResponsibilities());
    }
    public void displaySalary(){
        System.out.println("Salary is: " + job.getSalary() + " brutto");
    }
    public static void main(String[] args) {
        Painter painter = new Painter();
        Teacher teacher = new Teacher();
        Engineer engineer = new Engineer();
        Person anna = new Person("Anna", 28,engineer);
        Person artur = new Person("Artur", 28,painter);

        anna.displayResponsibilities();
        anna.displaySalary();
        artur.displayResponsibilities();
        artur.displaySalary();
    }
}