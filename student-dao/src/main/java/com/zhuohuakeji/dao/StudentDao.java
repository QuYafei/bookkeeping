package com.zhuohuakeji.dao;

import com.zhuohuakeji.entity.Student_entity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
public interface StudentDao
{
    int saveStudent(Student_entity s);
    int deleteStudent(@Param("id") int id);
    int updateStudent(Student_entity s);
    List<Student_entity> getStudents();

}
