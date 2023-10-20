package com.develhope.java15.fakecrud;

public class Student {
    private int id;
    private String name;
    private float averageGrade;

    public Student(int id, String name, float averageGrade) {
        this.id = id;
        this.name = name;
        this.averageGrade = averageGrade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getAverageGrade() {
        return averageGrade;
    }
}
