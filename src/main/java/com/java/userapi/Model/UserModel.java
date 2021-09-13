package com.java.userapi.Model;

import java.time.LocalDate;
import javax.validation.constraints.NotEmpty;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class UserModel {

    @Id
    private String userId;
    @NotEmpty(message = "First Name can not be empty")
    private String firstName;
    @NotEmpty(message = "Last Name can not be empty")
    private String lastName;
    private LocalDate DOB;
    private String gender;
    @NotEmpty(message = "User Name can not be empty")
    private String userName;
    @NotEmpty(message = "Password Name can not be empty")
    private String password;


    public String getUserId() {
        return userId;
    }

    public UserModel setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public UserModel(String userId, String firstName, String lastName, LocalDate DOB, String gender, String userName, String password) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.gender = gender;
        this.userName = userName;
        this.password = password;
    }

    public UserModel() {
    }

    public String getFirstName() {
        return firstName;
    }

    public UserModel setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserModel setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public UserModel setDOB(LocalDate DOB) {
        this.DOB = DOB;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public UserModel setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public UserModel setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserModel setPassword(String password) {
        this.password = password;
        return this;
    }
}