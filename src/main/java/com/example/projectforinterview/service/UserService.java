package com.example.projectforinterview.service;

import com.example.projectforinterview.entity.Customer;

import java.util.List;

public interface UserService {

    int checkIfExist(String username);

    void userRegister(String username,String password);

    List<Customer> getUserList();

    List<Customer> userLogin(String username,String password);
}
