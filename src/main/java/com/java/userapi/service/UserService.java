package com.java.userapi.service;

import com.java.userapi.Model.UserModel;
import java.util.List;
import java.util.Optional;

public interface UserService {

    void registerUser(UserModel user);

    List<UserModel> getUserByFirstName(String name);

    Optional<UserModel> getUserById(String userId);

    void updateUser(UserModel user);

    void deleteUser(String userId);
}
