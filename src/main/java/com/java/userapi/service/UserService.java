package com.java.userapi.service;

import com.java.userapi.Model.UserModel;
import com.java.userapi.exception.UserAlreadyExistsException;
import java.util.List;
import java.util.Optional;

public interface UserService {

    UserModel registerUser(UserModel user) throws UserAlreadyExistsException;

    List<UserModel> getUserByFirstName(String name);

    Optional<UserModel> getUserById(String userId);

/*    void updateUser(UserModel user);

    void deleteUser(String userId);*/
}
