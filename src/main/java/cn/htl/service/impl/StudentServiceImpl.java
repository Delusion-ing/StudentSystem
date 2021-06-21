package cn.htl.service.impl;

import cn.htl.mapper.StudentDao;
import cn.htl.pojo.Student;
import cn.htl.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao studentDao;
    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
