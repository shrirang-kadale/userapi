package com.java.userapi.serviceImpl;

import com.java.userapi.Model.UserModel;
import com.java.userapi.repository.UserRepository;
import com.java.userapi.service.UserService;
import com.java.userapi.util.ValidationUtil;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void registerUser(UserModel user) {

        ValidationUtil.validateUserDetails(user);
        userRepository.save(user);
    }

    @Override
    public List<UserModel> getUserByFirstName(String name) {

        List<UserModel> user = userRepository.findByFirstName(name);
        System.out.println(user);
        return user;
    }

    @Override
    public Optional<UserModel> getUserById(String userId) {
        return userRepository.findById(userId);
    }

    @Override
    public void updateUser(UserModel user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }
}
