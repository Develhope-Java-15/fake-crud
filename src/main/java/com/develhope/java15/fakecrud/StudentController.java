package com.develhope.java15.fakecrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentDatabase database;

    @GetMapping
    @ResponseBody
    public List<Student> get() {
        return database.retrieveAll();
    }

    @PostMapping
    @ResponseBody
    public Student insert(@RequestBody Student student) {
        database.insert(student);
        return student;
    }
}
