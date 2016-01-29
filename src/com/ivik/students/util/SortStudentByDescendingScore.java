package com.ivik.students.util;

import com.ivik.students.model.Student;

/**
 * Created by Eigenaar on 28-1-2016.
 */
public class SortStudentByDescendingScore implements StudentComparable {

    @Override
    public int compareTo(Student s1, Student s2) {
        if (s1.getScore()==s2.getScore()){
            return 0;
        }
        if (s1.getScore()<s2.getScore()){
            return -1;
        }
        return 1;

    }
}
