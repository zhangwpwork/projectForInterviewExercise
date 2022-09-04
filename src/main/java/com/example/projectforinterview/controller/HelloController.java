package com.example.projectforinterview.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Api(value = "HelloController",tags = "初始化数据接口")
public class HelloController {
    @RequestMapping("/")
    public String Index(){
        return "index";
    }
    @RequestMapping("single")
    public String single(){
        return "single";
    }
    @RequestMapping("about")
    public String about(){
        return "about";
    }
    @RequestMapping("contact")
    public String contact(){
        return "contact";
    }@RequestMapping("latest")
    public String latest(){
        return "latest-news";
    }
    @RequestMapping("services")
    public String services(){
        return "services";
    }
    @RequestMapping("projects")
    public String projects(){
        return "projects";
    }


    @RequestMapping("sayHello")
    @ApiResponses(value = { @ApiResponse(code = 1000, message = "成功"), @ApiResponse(code = 1001, message = "失败"),
            @ApiResponse(code = 1002, response = String.class,message = "缺少参数") })
    @ApiOperation(value = "sayHello")
    public String sayHello(){
        return "contact";
    }

    @RequestMapping("success")
    public String successPage(){
        return "index";
    }
}
