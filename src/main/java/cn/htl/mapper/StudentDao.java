package cn.htl.mapper;

import cn.htl.pojo.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAll();
}
