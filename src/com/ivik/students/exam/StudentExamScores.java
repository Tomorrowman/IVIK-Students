package com.ivik.students.exam;

import com.ivik.students.model.Student;
import com.ivik.students.util.SortUtils;

/**
 * Created by Eigenaar on 14-1-2016.
 */
public class StudentExamScores {
    private Student[]students;
    public StudentExamScores(){
        initExamScores();
    }

    private void initExamScores() {
        Student student1 = new Student("Ruud", 55.6);
        Student student2 = new Student("Piet", 34.7);
        Student student3 = new Student("Henk", 78.2);
        Student student4 = new Student("Daan", 99.9);
        Student student5 = new Student("Kees", 64.5);

        students= new Student []{student1, student2, student3, student4, student5};
    }
    public void reportStudentScores(){
        SortUtils.sortStudents(students);
        System.out.println("Name     "+"Score");
        System.out.println("------   "+"------");
        for (int i=0; i<=students.length-1; i++){
            String name=students[i].getName();
            double score=students[i].getScore();
            System.out.format("%4s%9s%n", name, score);
        }
    }

    public static void main(String[] args) {
        new StudentExamScores().reportStudentScores();
    }
}
