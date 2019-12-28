package com.zhaozy.test.controller;

import com.zhaozy.test.entity.Student;
import com.zhaozy.test.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zhaozy
 * @date 2019/11/30 3:17 下午
 * @email 1991005001@qq.com
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Student> selectAll(){
        LOGGER.info("master");
        LOGGER.info("test");
        return studentService.selectAll();
    }
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "student hello";
    }

}
