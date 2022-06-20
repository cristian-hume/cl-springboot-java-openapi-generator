package ch.springboot.java.app.openapigenerator.service;

import ch.springboot.java.app.openapigenerator.model.CreateUserRequest;
import ch.springboot.java.app.openapigenerator.model.CreateUserResponse;
import ch.springboot.java.app.openapigenerator.model.FindUserResponse;
import ch.springboot.java.app.openapigenerator.model.UpdateUserRequest;
import org.springframework.stereotype.Service;

import java.util.UUID;


public interface UserService {

    CreateUserResponse createUser(CreateUserRequest createUserRequest);

    FindUserResponse findUser(UUID userId);

    void updateUser(String userId, UpdateUserRequest updateUserRequest);

    void deleteUser(String userId);
}
