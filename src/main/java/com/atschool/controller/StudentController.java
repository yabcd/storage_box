package com.atschool.controller;

import com.atschool.entity.Student;
import com.atschool.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/add")
    public String add(){
        Student s = new Student();
        s.setAge(15);
        s.setName("new");
        studentService.add(s);
        return "";
    }
}
