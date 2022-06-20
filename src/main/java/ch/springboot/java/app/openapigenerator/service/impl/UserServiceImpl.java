package ch.springboot.java.app.openapigenerator.service.impl;

import ch.springboot.java.app.openapigenerator.model.CreateUserRequest;
import ch.springboot.java.app.openapigenerator.model.CreateUserResponse;
import ch.springboot.java.app.openapigenerator.model.FindUserResponse;
import ch.springboot.java.app.openapigenerator.model.UpdateUserRequest;
import ch.springboot.java.app.openapigenerator.repository.UserRepository;
import ch.springboot.java.app.openapigenerator.service.UserService;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author  Cristian Hume Henriquez
 * @version 1.0.0
 * @since   2022.03.08-RENNY (HAPPY-BIRTHDAY)
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
