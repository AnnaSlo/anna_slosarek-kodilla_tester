package com.kodilla.stream.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    public void testGetStudentTeacherPairsWithMixedData(){
        //given
        List<Student> students = Arrays.asList(
                new Student("Jan Kowalski", new Teacher("Tomasz Nowak")),
                new Student("Anna Zawadzka", null)
        );
        //when
        List<String> pairs = Application.getStudentTeacherPair(students);

        //then
        assertEquals(2, pairs.size());
        assertEquals("uczeń: Jan Kowalski, nauczyciel: Tomasz Nowak", pairs.get(0));
        assertEquals("uczeń: Anna Zawadzka, nauczyciel: <undefined>", pairs.get(1));
    }

    @Test
    public void testGetStudentTeacherPairsAllUndefined() {
        //given
        List<Student> students = Arrays.asList(
                new Student("Adam Nowak", null),
                new Student("Ewa Kowal", null)
        );

        //when
        List<String> pairs = Application.getStudentTeacherPair(students);

        //then
        assertEquals(2, pairs.size());
        assertEquals("uczeń: Adam Nowak, nauczyciel: <undefined>", pairs.get(0));
        assertEquals("uczeń: Ewa Kowal, nauczyciel: <undefined>", pairs.get(1));
    }


}