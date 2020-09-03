package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
//@RequestMapping("demo")
public class UserInterfaceController {

    @Autowired @Qualifier("restTemplateBean")
    RestTemplate rt;

    @Autowired @Qualifier("str")
    String str;

    @RequestMapping(value="/")
    public String hello() {
//        return "Hello World"+rt.toString();
        return "Hello World "+str;
    }

    @RequestMapping(value="/2nd")
    public String hello2() {
        return "Hello World 2";
    }
}
