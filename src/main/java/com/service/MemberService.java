package com.service;

import com.Async.MemberServiceAsync;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MemberService {
    @Autowired
    private MemberServiceAsync memberServiceAsync;
    @RequestMapping("/getMember")
    public String getMember() {
        return "许明洋";
    }

    @RequestMapping("/getAge")
    public String getAge(int age) {
        return "成功获取年龄";
    }

    //Async多线程注解的使用
    @RequestMapping("/addMember")
    public String addMember() {
        //1.数据库插入数据
        log.info("<01>");
        //2.发送短信sms
        //单独写线程不建议，建议使用异步注解或者线程池
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                sms();
//            }
//        }).start();
        memberServiceAsync.sms();
        log.info("<04>");
        return "用户注册成功";
    }

    //异步注解写在当前类中会失效
//    @Async
//    public String sms() {
//        try {
//            log.info("<02>");
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        log.info("<03>");
//        return "短信发送完成";
//    }
}
