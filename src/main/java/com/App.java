package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

//第三种启动方式
@SpringBootApplication
//解决mybatis框架查询报错
@MapperScan("com.xmy.mapper")
//开启定时任务注解
@EnableScheduling
//开启异步注解
@EnableAsync
public class App {
    /*
    SpringBootApplication这个注解包含组合：
    EnableAutoConfiguration
    ComponentScan
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
    /*
    ComponentScan扫描范围：
    当前启动类同级包或者子包下面
     */
}
