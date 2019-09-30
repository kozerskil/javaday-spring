package com.example.demo;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Greeting hello() {
        return Greeting.builder()
            .id(UUID.randomUUID().toString())
            .content("Greetings from Spring Boot!")
            .build();
    }
}
