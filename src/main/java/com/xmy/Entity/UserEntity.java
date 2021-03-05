package com.xmy.Entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

//lombok中的注解
@Data
//lombok中自动生成日志的注解
@Slf4j
public class UserEntity {
    private String userName;
    private Integer age;
    private Integer id;

    public UserEntity() {

    }
    public UserEntity(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //lomBok测试
    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity();
        //set,getid注销，没办法调用，使用lombok可以实现调用
        userEntity.setId(1);
    }
}
