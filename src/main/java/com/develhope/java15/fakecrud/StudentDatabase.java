package com.develhope.java15.fakecrud;

import org.springframework.stereotype.Component;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    
    public Optional<Student> searchStudent(int id) {
        for(Student student : students) {
            if(student.getId() == id) {
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }
}
