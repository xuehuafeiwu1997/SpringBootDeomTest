package com.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan("com")//定义扫包的范围，这样可以访问MemberService  这里只能写com，写service的话无法访问到MemberService,具体原因还不知道为什么 访问Demo1Application也访问不到
public class HelloWorld {
    /*
    如果在类上加上@RestController注解，该类中所有SpringMVCUrl接口映射都是返回json格式
    在每个方法上加上responseBody注解，返回json格式
    @RestController是SpringMVC提供的，而不是SpringBoot提供的
    Rest微服务接口开发中，Rest风格，数据传输格式json格式 协议http协议

    Controller控制层的注解 SpringMVCUrl接口映射 默认情况下返回页面跳转，如果需要返回json格式
     */

    //想要返回json格式，以前使用Controller注解，在下面再添加映射
    //访问接口格式
//    @ResponseBody()
    @RequestMapping("/getUser")
    public String getUser() {
        return "许明洋";
    }

    //z这样写的话。每个都要加这些代码，所以直接使用RestController

    public static void main(String[] args) {

        //传入启动类入口，会默认整合tomcat服务器，端口号默认为8080
        SpringApplication.run(HelloWorld.class,args);
    }
}
