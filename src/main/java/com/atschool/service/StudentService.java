package com.atschool.service;

import com.atschool.entity.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    public int add(Student student);
    public int delete(int id);
    public int edit(Student student);
    public Student find(int id);
}
