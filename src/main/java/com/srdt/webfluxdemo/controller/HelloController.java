package com.srdt.webfluxdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping("greet")
    public String sayHello() {
        return "Hello, Your Are Welcome!!";
    }
}
