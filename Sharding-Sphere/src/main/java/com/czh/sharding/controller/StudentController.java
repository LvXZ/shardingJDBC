package com.czh.sharding.controller;

import com.czh.sharding.entity.Student;
import com.czh.sharding.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @Author: lvxiaozheng
 * @Date: 2019/3/11
 */

@RestController
public class StudentController {


    @Autowired
    private StudentService studentService;

    /**
     * 获取所有用户信息
     * @return
     */
    @GetMapping("/student/{id}")
    public Student getStudents(@PathVariable String id){
        return studentService.findStudentPasswordById(id);
    }

    /**
     * 增加新用户
     * @param
     * @return
     */
    @PostMapping("/student/add")
    public boolean addStudent(@ModelAttribute Student student){
        return studentService.updateStudentInfo(student);
    }

}
