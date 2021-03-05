package com.xmy.service;

import com.xmy.Entity.UserEntity;
import com.xmy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserMapper userMapper;

    //插入数据到users表中
    @RequestMapping("/insertUser")
    public String insertUser(String userName, Integer age) {
        int update = jdbcTemplate.update("insert into users values (null ,?,?)",userName,age);
        return update > 0 ? "success" : "fail";
    }

    //mybatis查询
    @RequestMapping("/mybatisFindById")
    public UserEntity mybatisFindById(Integer id) {
        return userMapper.selectByUserId(id);
    }


    //mybatis插入操作
    @RequestMapping("/insertUserMyBatis")
    public String insertUserMyBatis(String userName, Integer age) {
        int insert = userMapper.insertUser(userName,age);
        return insert > 0 ? "success" : "fail";
    }

    //热部署测试
    @RequestMapping("/myIndex")
    public String myIndex() {
        return "许明洋";
    }
}
