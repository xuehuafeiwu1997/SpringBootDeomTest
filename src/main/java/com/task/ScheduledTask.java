package com.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ScheduledTask {
    /**
     * 每隔3秒时间执行一次taskService
     */
//    @Scheduled(fixedRate=3000)
    @Scheduled(cron = "1/2 * * * * ?")
    public void taskService() {
        log.info("<<定时任务执行>>" + System.currentTimeMillis());
    }
}
