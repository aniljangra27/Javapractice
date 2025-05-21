package com.spring345.springbootapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoClass {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
