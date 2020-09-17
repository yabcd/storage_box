package com.atschool.dao;

import com.atschool.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudentDao {
  public int add(Student student);
  public int delete(int id);
  public int edit(Student student);
  public Student find(int id);
}
