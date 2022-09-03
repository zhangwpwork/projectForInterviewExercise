package com.example.projectforinterview.dao;

import com.example.projectforinterview.entity.Customer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("select count(*) from customer where username=#{username}")
    int checkIfExist(String username);

    @Insert("insert into customer(username,password,rid) values (#{username},#{password},1)")
    void userRegister(String username,String password);

    @Select("select * from customer")
    List<Customer> getUserList();
}
