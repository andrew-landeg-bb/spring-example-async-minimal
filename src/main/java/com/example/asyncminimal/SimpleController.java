package com.example.asyncminimal;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@AllArgsConstructor
@RestController
public class SimpleController {
    SimpleService simpleService;

    @GetMapping("/v1")
    public ResponseEntity<String> somethingSimple() {
        final long start = System.currentTimeMillis();
        final var response = simpleService.synchronousTask();
        final long end = System.currentTimeMillis();

        final var payload = String.format("%s : completed in %dms", response, end - start);
        log.info("web thread completing: {}", payload);
        return ResponseEntity.ok(payload);
    }
}
