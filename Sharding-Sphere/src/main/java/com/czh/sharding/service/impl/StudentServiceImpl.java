package com.czh.sharding.service.impl;

import com.czh.sharding.dao.StudentDao;
import com.czh.sharding.entity.Student;
import com.czh.sharding.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @Description:
 * @Author: lvxiaozheng
 * @Date: 2019/3/11
 */

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;


    @Override
    public Student findStudentPasswordById(String studentId) {
        return studentDao.selectPasswordById(studentId);
    }

    @Override
    public boolean updateStudentInfo(Student student) {
        if(studentDao.updateByPrimaryKeySelective(student) == 1){
            return true;
        }
        return false;
    }
}
