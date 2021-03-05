package com.xmy.mapper;

import com.xmy.Entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

//mybatis框架整合
public interface UserMapper {
    @Insert("INSERT into users values (null,#{userName},#{age});")
    int insertUser(@Param("userName") String userName,@Param("age") Integer age);

    @Select("select id as id,name as userName,age as age from users where id=#{id};")
    UserEntity selectByUserId(@Param("id") Integer id);
}
