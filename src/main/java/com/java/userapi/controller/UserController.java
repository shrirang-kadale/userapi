package com.java.userapi.controller;

import com.java.userapi.Model.UserModel;
import com.java.userapi.service.UserService;
import java.util.List;
import java.util.Optional;
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

    @GetMapping(value = "/getById")
    public Optional<UserModel> getUserById(@RequestParam(name = "userId") String userId) {
        return userService.getUserById(userId);
    }

    @PutMapping(value = "/update")
    public void updateUser(@RequestBody UserModel user) {
        userService.updateUser(user);
    }

    @DeleteMapping(value = "/delete")
    public void deleteUser(@PathVariable String userId) {
        userService.deleteUser(userId);
    }

}
