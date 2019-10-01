package com.example.parameters.controller;

import com.example.parameters.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

}
