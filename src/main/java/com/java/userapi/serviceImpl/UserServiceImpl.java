package com.java.userapi.serviceImpl;

import com.java.userapi.Model.UserModel;
import com.java.userapi.exception.UserAlreadyExistsException;
import com.java.userapi.exception.UserNotFoundException;
import com.java.userapi.repository.UserRepository;
import com.java.userapi.service.UserService;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     *
     * @param user
     * @return UserModel
     * @throws UserAlreadyExistsException
     */
    @Override
    public UserModel registerUser(UserModel user) throws UserAlreadyExistsException {

        UserModel newUser = userRepository.findByUserName(user.getUserName());
        if (Objects.isNull(newUser)) {
            return userRepository.save(user);
        } else {
            throw new UserAlreadyExistsException("The username is already in use, please try a different email address.");
        }
    }

    /**
     * Get users by their first name
     * @param name
     * @return List<UserModel>
     */
    @Override
    public List<UserModel> getUserByFirstName(String name) {

        List<UserModel> user = userRepository.findByFirstName(name);
        return user;
    }

    /**
     * Get user details by userId
     * @param userId
     * @return Optional<UserModel>
     */
    @Override
    public Optional<UserModel> getUserById(String userId) {
        return userRepository.findById(userId);
    }

    @Override
    public void updateUser(String userId) {
        Optional<UserModel> user = userRepository.findById(userId);

        if (user.isPresent()) {
            userRepository.save(user.get());
        } else {
            throw new UserNotFoundException("User not Found");
        }

    }

    @Override
    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }
}
