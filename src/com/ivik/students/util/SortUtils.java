package com.ivik.students.util;

import com.ivik.students.model.Student;

/**
 * Created by Eigenaar on 13-1-2016.
 */
public class SortUtils {
    public static void sortStudents(Student[] students){
        boolean sorted=false;
        while (!sorted){
            sorted=true;
            for (int i =0; i<=students.length-1; i++) {
                if (students[i].getScore() > students[i+1].getScore()){
                    Student tmp = students[i];
                    students[i] = students[i+1];
                    students[i+1] = tmp;
                    sorted=false;
                }
            }


        }

    }

}
