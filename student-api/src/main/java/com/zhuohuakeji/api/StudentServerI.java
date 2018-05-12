package com.zhuohuakeji.api;

import com.zhuohuakeji.dto.StudentDto;
import com.zhuohuakeji.vo.StudentVo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface StudentServerI {
    @PostMapping("/savestudent/{age}/{name}/{sex}/{adddress}")
    int saveStudent(@PathVariable("age") Integer age,@PathVariable("name") String name,@PathVariable("sex") Integer sex,@PathVariable("address") String address);
    @PostMapping("/deleteStudent/{id}")
    int deleteStudent(@PathVariable("id") Integer id);
    @PostMapping("/update/{v}")
    int updateStudent(@PathVariable("v") StudentVo v);
    @PostMapping("/getallstudent")
    List<StudentDto> getAllStudent();
}
