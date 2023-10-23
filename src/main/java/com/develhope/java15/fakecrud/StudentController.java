package com.develhope.java15.fakecrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/{id}")
    public ResponseEntity<?> returnStudent(@PathVariable int id) {
        Optional<Student> result = database.searchStudent(id);
        if (result.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(result.get());
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStudent(@PathVariable int id) {
        database.deleteStudent(id);
    }

}