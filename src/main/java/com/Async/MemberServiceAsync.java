package com.Async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MemberServiceAsync {

    //异步注解写法
//    @Async
    //异步注解和线程池结合写法
    @Async("taskExecutor")
    public String sms() {
        try {
            log.info("<02>");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("<03>");
        return "短信发送完成";
    }
    /*
    一定要结合线程池
     */
}
