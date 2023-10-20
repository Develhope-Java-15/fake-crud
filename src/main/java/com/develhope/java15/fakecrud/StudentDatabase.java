package com.develhope.java15.fakecrud;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class StudentDatabase {
    private List<Student> students;

    public StudentDatabase(){
        this.students = new ArrayList<>();
    }

    public void insert(Student student){
        students.add(student);
    }

    public List<Student> retrieveAll(){
        return students;
    }
}
