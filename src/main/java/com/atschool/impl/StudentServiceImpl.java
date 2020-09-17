package com.atschool.impl;

import com.atschool.dao.StudentDao;
import com.atschool.entity.Student;
import com.atschool.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;
    @Override
    public int add(Student student) {
        return studentDao.add(student);
    }

    @Override
    public int delete(int id) {
        return studentDao.delete(id);
    }

    @Override
    public int edit(Student student) {
        return studentDao.edit(student);
    }

    @Override
    public Student find(int id) {
        return studentDao.find(id);
    }
}
