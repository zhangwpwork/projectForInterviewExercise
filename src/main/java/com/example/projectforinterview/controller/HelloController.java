package com.example.projectforinterview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("sayHello")
    public String sayHello(){
        return "login";
    }

    @RequestMapping("success")
    public String successPage(){
        return "success";
    }
}
