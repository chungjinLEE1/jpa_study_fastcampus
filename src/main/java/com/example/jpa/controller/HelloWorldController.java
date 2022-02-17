package com.example.jpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// cmd + shift + t : test code 만들기
@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloworld(){
        return "hello world";
    }

}
