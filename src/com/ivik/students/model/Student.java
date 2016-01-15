package com.ivik.students.model;

/**
 * Created by Eigenaar on 13-1-2016.
 */
public class Student {
    private String name;
    private double score;

    public Student (String name, double score){
        this.name=name;
        this.score=score;
    }
    public String getName(){
        return this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getScore(){
        return this.score=score;
    }
    public void setScore(double score){
        this.score=score;
    }
}
