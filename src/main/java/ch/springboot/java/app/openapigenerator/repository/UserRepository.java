package ch.springboot.java.app.openapigenerator.repository;

import ch.springboot.java.app.openapigenerator.model.CreateUserRequest;
import ch.springboot.java.app.openapigenerator.model.CreateUserResponse;
import ch.springboot.java.app.openapigenerator.model.FindUserResponse;
import ch.springboot.java.app.openapigenerator.model.UpdateUserRequest;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author  Cristian Hume Henriquez
 * @version 1.0.0
 * @since   2022.03.08-RENNY (HAPPY-BIRTHDAY)
 */
@Repository
public class UserRepository {

    public CreateUserResponse createUser(CreateUserRequest createUserRequest) {
        return null;
    }

    public FindUserResponse findUser(UUID userId) {
        return null;
    }

    public void updateUser(String userId, UpdateUserRequest updateUserRequest) {

    }

    public void deleteUser(String userId) {

    }

}
