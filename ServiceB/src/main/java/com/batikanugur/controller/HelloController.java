package com.batikanugur.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {
    //http://http://localhost:9092/
    @GetMapping("/")
    public String hello (){
        return "Service B Hello";
    }
    //http://http://localhost:9092/info
    @GetMapping("/info")
    public String info (){
        return "Info: Service B";
    }

}
