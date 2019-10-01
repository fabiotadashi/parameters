package com.example.parameters.controller;

import com.example.parameters.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("students")
public class StudentController {

    private List<Student> studentList;

    public StudentController() {
        studentList = new ArrayList<>();
        studentList.add(new Student("1", "Fabio"));
        studentList.add(new Student("2", "José"));
        studentList.add(new Student("3", "João"));
    }

    @GetMapping
    public List<Student> getStudentList(@RequestParam(value = "name", required = false) String name){
        return studentList.stream()
                .filter(student -> name == null || student.getName().startsWith(name))
                .collect(Collectors.toList());
    }

    @GetMapping(path = "{studentId}")
    public Student getStudentById(@PathVariable(name = "studentId") String studentId){
        for (Student student : studentList) {
            if(student.getId().equals(studentId)){
                return student;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Student not found");
    }

}
