package com.example.projectforinterview.service.impl;

import com.example.projectforinterview.dao.UserDao;
import com.example.projectforinterview.entity.Customer;
import com.example.projectforinterview.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public int checkIfExist(String username) {
        return userDao.checkIfExist(username);
    }

    @Override
    public void userRegister(String username, String password) {
       userDao.userRegister(username,password);
       log.info("持久层方法运行成功");
    }

    @Override
    public List<Customer> getUserList() {
        return userDao.getUserList();
    }

    @Override
    public List<Customer> userLogin(String username, String password) {
        return userDao.userLogin(username,password);
    }
}
