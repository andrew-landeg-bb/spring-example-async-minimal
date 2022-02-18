package com.example.asyncminimal;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class SimpleService {
    AsyncTaskService asyncTaskService;

    public String synchronousTask() {
        log.info("Starting sync task");
        final var response = "completed-synchronously";
        /// now trigger something long running
        asyncTaskService.longRunningTask();
        log.info("Completing sync task");
        return response;
    }
}
