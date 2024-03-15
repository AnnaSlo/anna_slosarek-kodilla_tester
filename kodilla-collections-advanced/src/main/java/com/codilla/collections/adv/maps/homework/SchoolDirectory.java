package com.codilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<School, Principal> schoolData = new HashMap<>();
        Principal john = new Principal("John", "Stevenson");
        Principal anna = new Principal("Anna", "Stewart");
        Principal bart = new Principal("Bart", "Simpson");

        School riverside = new School("Riverside High School", Arrays.asList(12,24,28,35));
        School maplewood = new School("Maplewood Academy", Arrays.asList(18,35,26));
        School pinterest = new School("Pinterest School", Arrays.asList(23,18,31,17,25));

        schoolData. put(riverside,john);
        schoolData.put(maplewood,anna);
        schoolData.put(pinterest,bart);

        for (Map.Entry<School,Principal> schoolDataEntry : schoolData.entrySet()){
            System.out.println(schoolDataEntry.getValue().getFirstName() + " " + schoolDataEntry.getValue().getLastName() + " is Principal of " + schoolDataEntry.getKey().getSchoolName() + " which have " + schoolDataEntry.getKey().allStudents() + " students" );       }
    }
}
