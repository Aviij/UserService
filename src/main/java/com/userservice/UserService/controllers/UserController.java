package com.userservice.UserService.controllers;

import com.userservice.UserService.Services.UserService;
import com.userservice.UserService.dtos.UserDTO;
import com.userservice.UserService.dtos.UserTPDTO;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/user_db")
public class UserController {

    //  This method is used to return all the user data .
    @Autowired
    private UserService userService;

    @GetMapping("/getAll")

    public List<UserDTO> getAllUsers(){

        return userService.getAllUsers();

    }






}
