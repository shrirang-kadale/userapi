package com.java.userapi.controller;

import com.java.userapi.Model.UserModel;
import com.java.userapi.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/register")
    public void userRegistration(@Validated @RequestBody UserModel user) {
    System.out.println("Inside Controller");
    userService.registerUser(user);
    }

    @GetMapping(value = "/getUser")
    public List<UserModel> getUserByName(@RequestParam(name = "firstName") String firstName) {

        return userService.getUserByFirstName(firstName);
    }

}
