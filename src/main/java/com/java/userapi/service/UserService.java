package com.java.userapi.service;

import com.java.userapi.Model.UserModel;
import java.util.List;

public interface UserService {

    void registerUser(UserModel user);

    List<UserModel> getUserByFirstName(String name);
}
