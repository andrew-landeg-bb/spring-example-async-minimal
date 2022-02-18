package com.example.asyncminimal;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AsyncTaskService {
    @Async("customThreadPoolTaskExecutor")
    @SneakyThrows
    public void longRunningTask() {
        final var start = System.currentTimeMillis();
        log.info("starting long running task");
        Thread.sleep(3000);
        final var end = System.currentTimeMillis();
        log.info("long running task complete in {}ms", end - start);
    }
}
