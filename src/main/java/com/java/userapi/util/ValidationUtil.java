package com.java.userapi.util;

import com.java.userapi.Model.UserModel;
import com.java.userapi.exception.ValidationException;
import java.util.Objects;

public class ValidationUtil {
    public static boolean validateUserDetails(UserModel userModel) throws ValidationException {

        if(Objects.isNull(userModel.getFirstName()) &&
                Objects.isNull(userModel.getLastName()) &&
                Objects.isNull(userModel.getUsername()) &&
                Objects.isNull(userModel.getPassword())) {
             throw new ValidationException("Required fields are missing");
        }
        throw new ValidationException("Required fields are missing");
    }
}
