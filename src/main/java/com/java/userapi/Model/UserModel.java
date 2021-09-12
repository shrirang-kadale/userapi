package com.java.userapi.Model;

import java.time.LocalDate;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class UserModel {

    @NotEmpty(message = "First Name can not be empty")
    private String firstName;
    @NotEmpty(message = "Last Name can not be empty")
    private String lastName;
    private LocalDate DOB;
    private String gender;
    @Id
    @NotEmpty(message = "User Name can not be empty")
    private String username;
    @NotEmpty(message = "Password Name can not be empty")
    private String password;

    public UserModel(String firstName, String lastName, LocalDate DOB, String gender, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.gender = gender;
        this.username = username;
        this.password = password;
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

    public String getUsername() {
        return username;
    }

    public UserModel setUsername(String username) {
        this.username = username;
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