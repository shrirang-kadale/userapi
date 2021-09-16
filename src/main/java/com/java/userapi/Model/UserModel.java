package com.java.userapi.Model;

import java.time.LocalDate;
import javax.validation.constraints.NotEmpty;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
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

    @NotEmpty(message = "Password can not be empty")
    private String password;

}