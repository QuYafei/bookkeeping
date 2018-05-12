package com.zhuohuakeji.server;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.zhuohuakeji.api.StudentServerI;
import com.zhuohuakeji.dao.StudentDao;
import com.zhuohuakeji.dto.StudentDto;
import com.zhuohuakeji.entity.Student_entity;
import com.zhuohuakeji.vo.StudentVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Nullable;
import java.util.List;

@RestController
public class StudentServeri implements StudentServerI{
    @Value("${server.port}")
    private int port;
    @Autowired
    private StudentDao dao;
    @Override
    @PostMapping("/savestudent/{age}/{name}/{sex}/{address}")
    public int saveStudent(@PathVariable("age") Integer age,@PathVariable("name") String name,@PathVariable("sex") Integer sex,@PathVariable("address")String address) {
        Student_entity s=new Student_entity();
        s.setAge(age);
        s.setName(name);
        s.setSex(sex);
        s.setAddress(address);
        int i = dao.saveStudent(s);
        return i;
    }

    @Override
    @PostMapping("/deleteStudent/{id}")
    public int deleteStudent(@PathVariable("id") Integer id) {
        int i = dao.deleteStudent(id);
        return i;
    }

    @Override
    @PostMapping("/update/{v}")
    public int updateStudent(@Param("v") StudentVo v) {
        Student_entity s=new Student_entity();
        s.setSex(v.getSex());
        s.setName(v.getName());
        s.setAge(v.getAge());
        s.setId(v.getId());
        return dao.updateStudent(s);
    }

    @Override
    @PostMapping("/getAllStudent")
    public List<StudentDto> getAllStudent() {
        List<Student_entity> students = dao.getStudents();
       return Lists.transform(students, new Function<Student_entity, StudentDto>() {
            @Nullable
            @Override
            public StudentDto apply(@Nullable Student_entity input) {
                StudentDto dto=new StudentDto();
                BeanUtils.copyProperties(input,dto);
                dto.setId(port);
                return dto;
            }
        });
    }
}
