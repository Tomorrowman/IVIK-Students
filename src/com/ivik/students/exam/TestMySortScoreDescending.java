package com.ivik.students.exam;

import com.ivik.students.model.Student;
import com.ivik.students.util.SortStudentByDescendingScore;
import com.ivik.students.util.SortUtils;
import com.ivik.students.util.StudentComparable;

/**
 * Created by Eigenaar on 28-1-2016.
 */
public class TestMySortScoreDescending {
    public static void main(String[] args) {

        Student s1 = new Student ("Billy", 34.5);
        Student s2 = new Student ("Tommy", 67);
        Student s3 = new Student ("Hank", 3.56);
        Student s4 = new Student ("Sarah", 99.9);
        Student s5 = new Student ("Dan", 79.766);

        Student[] students = new Student[]{s1, s2, s3, s4, s5};

        StudentComparable sortByDescendingScore = new SortStudentByDescendingScore();

        SortUtils.sortStudents(students, sortByDescendingScore);

        for (Student s: students){
            System.out.format("Name : %15s : Score %6.2f\n", s.getName(), s.getScore());

        }
    }
}
