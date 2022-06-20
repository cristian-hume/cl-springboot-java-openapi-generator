package cl.springboot.java.app.openapigenerator.service;

import cl.springboot.java.app.openapigenerator.model.CreateUserRequest;
import cl.springboot.java.app.openapigenerator.model.CreateUserResponse;
import cl.springboot.java.app.openapigenerator.model.FindUserResponse;
import cl.springboot.java.app.openapigenerator.model.UpdateUserRequest;

import java.util.UUID;


public interface UserService {

    CreateUserResponse createUser(CreateUserRequest createUserRequest);

    FindUserResponse findUser(UUID userId);

    void updateUser(String userId, UpdateUserRequest updateUserRequest);

    void deleteUser(String userId);
}
