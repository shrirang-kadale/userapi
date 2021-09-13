package com.java.userapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UserAlreadyExistsException extends Throwable {
    public UserAlreadyExistsException(String user_already_exists) {
        super(user_already_exists);
    }
}
