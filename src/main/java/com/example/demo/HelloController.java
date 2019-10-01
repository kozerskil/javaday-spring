package com.example.demo;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Greeting hello() {
        return new Greeting(
            UUID.randomUUID().toString(),
            "Greetings from Spring!",
            LocalDateTime.now()
        );
    }
}
