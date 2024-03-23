package com.kodilla.stream.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan Kowalski", new Teacher("Tomasz Nowak")));
        students.add(new Student("Anna Zawadzka", null));
        students.add(new Student("Krzysztof Krawczyk", new Teacher("Barbara Nowacka")));
        students.add(new Student("Ewa Malinowska", null));

        List<String> pairs = getStudentTeacherPair(students);
        pairs.forEach(System.out::println);

    }
    public static List<String> getStudentTeacherPair(List<Student> students){
        List<String> pairs = new ArrayList<>();
        for (Student student : students){
            String teacherName = Optional.ofNullable(student.getTeacher())
                .map(Teacher::getName)
                .orElse("<undefined>");
        pairs.add("uczeń: " + student.getName() + ", nauczyciel: " + teacherName);
        }
        return pairs;
    }
}
