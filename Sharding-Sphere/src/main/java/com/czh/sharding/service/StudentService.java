package com.czh.sharding.service;

import com.czh.sharding.entity.Student;

/**
 * @Description:
 * @Author: lvxiaozheng
 * @Date: 2019/3/11
 */

public interface StudentService {

    Student findStudentPasswordById(String studentId);

    boolean updateStudentInfo(Student student);

}
