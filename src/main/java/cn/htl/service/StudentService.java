package cn.htl.service;

import cn.htl.pojo.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> findAll();
}
