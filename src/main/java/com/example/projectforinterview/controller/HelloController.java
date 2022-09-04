package com.example.projectforinterview.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
@Api(value = "HelloController",tags = "初始化数据接口")
public class HelloController {

    @RequestMapping("sayHello")
    @ApiResponses(value = { @ApiResponse(code = 1000, message = "成功"), @ApiResponse(code = 1001, message = "失败"),
            @ApiResponse(code = 1002, response = String.class,message = "缺少参数") })
    @ApiOperation(value = "sayHello")
    public String sayHello(){
        return "login";
    }

    @RequestMapping("success")
    public String successPage(){
        return "success";
    }
}
