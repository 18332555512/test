package com.zhaozy.test.service;

import com.zhaozy.test.dao.StudentDao;
import com.zhaozy.test.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhaozy
 * @date 2019/11/30 3:17 下午
 * @email 1991005001@qq.com
 */
@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public List<Student> selectAll() {
        return studentDao.selectAll();
    }
}
