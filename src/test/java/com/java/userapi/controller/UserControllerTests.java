package com.java.userapi.controller;

import com.java.userapi.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTests {

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    @Test
    void userRegistration() throws Exception {

    }

    @Test
    void getUserByName() {
    }

    @Test
    void getUserById() {
    }
}