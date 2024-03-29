package com.andr33ww.latihan.rest;

import com.andr33ww.latihan.controller.PerpusUtils;
import com.andr33ww.latihan.model.UserModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController{
    @Autowired
    PerpusUtils perpusUtils;

    @RequestMapping("/login")
    public UserModel login(){
        UserModel user = new UserModel();
        user.setGender("male");
        user.setName("andrew");
        return user;        
    }

    @GetMapping("/register")
    public UserModel register(){
        UserModel user = new UserModel();
        user.setGender("male");
        user.setName("andrew");
        return user;   
    }

    @GetMapping("/nama")
    public String nama(UserModel user) {
        return perpusUtils.titleCaseKalimat(user.getName());
    }
}