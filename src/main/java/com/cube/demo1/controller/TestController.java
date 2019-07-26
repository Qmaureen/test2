package com.cube.demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {

    @RequestMapping("/")
    public String test(){
        return "hello jenkins " +new Date();
    }
}
