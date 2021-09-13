package com.java.userapi.controller;

import com.java.userapi.Model.UserModel;
import com.java.userapi.exception.UserAlreadyExistsException;
import com.java.userapi.service.UserService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * User Controller
 */
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * User Registration API to register a valid user
     * @param user
     * @return UserModel
     * @throws UserAlreadyExistsException
     */
    @PostMapping(value = "/register")
    public UserModel userRegistration(@Validated @RequestBody UserModel user) throws UserAlreadyExistsException {

    return userService.registerUser(user);

    }

    /**
     * API to get all users by their firstName
     * @param firstName
     * @return List<UserModel>
     */
    @GetMapping(value = "/getUser")
    public List<UserModel> getUserByName(@RequestParam(name = "firstName") String firstName) {

        return userService.getUserByFirstName(firstName);
    }

    /**
     * API to get user details by userId
     * @param userId
     * @return Optional<UserModel>
     */
    @GetMapping(value = "/getById")
    public Optional<UserModel> getUserById(@RequestParam(name = "userId") String userId) {

        return userService.getUserById(userId);
    }

/*    @PutMapping(value = "/update")
    public void updateUser(@RequestBody UserModel user) {
        userService.updateUser(user);
    }

    @DeleteMapping(value = "/delete")
    public void deleteUser(@PathVariable String userId) {
        userService.deleteUser(userId);
    }*/

}
