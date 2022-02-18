package com.example.asyncminimal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@EnableAsync
@Configuration
public class AsyncConfiguration {
    @Bean // Spring boot provides a default executor, so this is not essential.
    public ThreadPoolTaskExecutor customThreadPoolTaskExecutor() {
        final var service = new ThreadPoolTaskExecutor();
        // loads of customisation is possible here....
        service.setCorePoolSize(4);
        service.setQueueCapacity(500);
        return service;
    }
}
