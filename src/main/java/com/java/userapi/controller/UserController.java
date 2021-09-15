package com.java.userapi.controller;

import com.java.userapi.Model.UserModel;
import com.java.userapi.exception.UserAlreadyExistsException;
import com.java.userapi.service.UserService;
import java.util.List;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * User Controller
 */
@RestController
@RequestMapping("/api/users")
public class UserController {

    private static final Logger logger = LogManager.getLogger(UserController.class);

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
    logger.info("log4j implementation");
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

    @PutMapping(value = "/update")
    public void updateUser(@RequestParam(name = "userId") String userId) {
        userService.updateUser(userId);
    }

    /**
     * API to delete the user by userId
     * @param userId
     */
    @DeleteMapping(value = "/delete/{userId}")
    public void deleteUser(@PathVariable String userId) {
        userService.deleteUser(userId);
    }

}
