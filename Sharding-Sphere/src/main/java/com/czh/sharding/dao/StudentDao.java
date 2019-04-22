package com.czh.sharding.dao;

import com.czh.sharding.entity.Student;
import java.util.List;


public interface StudentDao {

    Student selectPasswordById(String id);

    Student selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    int deleteByPrimaryKey(String id);

    int insert(Student record);

    int insertSelective(Student record);

}
