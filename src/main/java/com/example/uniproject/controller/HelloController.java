package com.example.uniproject.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/")
public class HelloController{
    @RequestMapping("/hello")
    public String Hello(){
        return "it's worked";
    }
}
