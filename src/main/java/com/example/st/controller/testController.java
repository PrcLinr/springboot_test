package com.example.st.controller;

import com.example.st.entity.User;
import com.example.st.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Slf4j
@CrossOrigin
public class testController {

    @Autowired
    public UserService userService;


    @GetMapping("/{id}")
    public User getUserList(@PathVariable Integer id){
        return userService.getUserList(id);
    }

    @GetMapping
    public String test(){
        return "hello";
    }



}
