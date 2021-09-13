package com.java.userapi.repository;

import com.java.userapi.Model.UserModel;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserModel, String> {

    UserModel save(UserModel user);

    List<UserModel> findByFirstName(String name);

    UserModel findByUserName(String userName);
}
