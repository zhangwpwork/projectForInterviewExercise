package com.example.projectforinterview.controller;

import com.example.projectforinterview.entity.Customer;
import com.example.projectforinterview.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("sys/user")
@Slf4j
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("userRegister")
    public String userRegister(String username, String password, Model model){
        if(username == null || password == null){
            model.addAttribute("message",username);
            return "failed";
        }
        else {
            int count = userService.checkIfExist(username);
            if(count>0){
                model.addAttribute("message",username+" is exist");
                return "failed";
            }
            else {userService.userRegister(username,password);
              log.info(username+"用户注册成功");
              model.addAttribute("message","user "+username+" is registered successful");
              return "success";
            }
        }
    }
    @RequestMapping("userList")
    public String getUserList(Model model){
        List<Customer> list = userService.getUserList();
        model.addAttribute("userList",list);
        return "userList";
    }
}