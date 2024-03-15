package com.codilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Integer> studentsPerClass = new ArrayList<>();

    public School(String schoolName, List<Integer> studentsPerClass) {
        this.schoolName = schoolName;
        this.studentsPerClass = studentsPerClass;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getNumberOfClasses(){
        return studentsPerClass.size();
    }
    public List<Integer> getStudentsPerClass() {
        return studentsPerClass;
    }

    public int allStudents(){
        int sum = 0;
        for (int students : studentsPerClass){
            sum = sum + students;
        }
        return sum;
    }


    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", studentsPerClass=" + studentsPerClass +
                '}';
    }
}
