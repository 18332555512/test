package com.zhaozy.test.dao;

import com.zhaozy.test.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.springframework.stereotype.Repository;

/**
 * @author zhaozy
 * @date 2019/11/30 3:17 下午
 * @email 1991005001@qq.com
 */
@Mapper
@Repository
public interface StudentDao {

    public Student selectAll();
}
