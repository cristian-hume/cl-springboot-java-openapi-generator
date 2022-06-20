package cl.springboot.java.app.openapigenerator.service.impl;

import cl.springboot.java.app.openapigenerator.model.CreateUserRequest;
import cl.springboot.java.app.openapigenerator.model.CreateUserResponse;
import cl.springboot.java.app.openapigenerator.model.FindUserResponse;
import cl.springboot.java.app.openapigenerator.model.UpdateUserRequest;
import cl.springboot.java.app.openapigenerator.repository.UserRepository;
import cl.springboot.java.app.openapigenerator.service.UserService;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author  Cristian Hume Henriquez
 * @version 1.0.0
 * @since   2022-06-21 (HAPPY-BIRTHDAY)
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public CreateUserResponse createUser(CreateUserRequest createUserRequest) {
        return null;
    }

    @Override
    public FindUserResponse findUser(UUID userId) {
        return null;
    }

    @Override
    public void updateUser(String userId, UpdateUserRequest updateUserRequest) {

    }

    @Override
    public void deleteUser(String userId) {

    }
}
