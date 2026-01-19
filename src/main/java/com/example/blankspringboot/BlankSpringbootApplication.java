package com.example.blankspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
public class BlankSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlankSpringbootApplication.class, args);
    }

    @RestController
    public static class Example {
        @GetMapping("/")
        public Map<String, String> getResponse() {
            return Map.of("message", "Programnya jalan");
        }

    }
}
