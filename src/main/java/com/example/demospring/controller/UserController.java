package com.example.demospring.controller;

import com.example.demospring.dto.UserDTO;
import com.example.demospring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin


public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public String getUser(){
        return "User: Emil";
    }

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

    @PutMapping("/updateUser")
    public String updateUser(){
        return "User Updated";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(){
        return "User Deleted";
    }
}
