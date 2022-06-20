package ch.springboot.java.app.openapigenerator.cotroller;

import ch.springboot.java.app.openapigenerator.api.UserApi;
import ch.springboot.java.app.openapigenerator.model.CreateUserRequest;
import ch.springboot.java.app.openapigenerator.model.CreateUserResponse;
import ch.springboot.java.app.openapigenerator.model.FindUserResponse;
import ch.springboot.java.app.openapigenerator.model.UpdateUserRequest;
import ch.springboot.java.app.openapigenerator.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author  Cristian Hume Henriquez
 * @version 1.0.0
 * @since   2022.03.08-RENNY (HAPPY-BIRTHDAY)
 */
@RestController
@RequestMapping("/api/openapi-gemerator//v1")
public class UserController implements UserApi {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Override
    public ResponseEntity<CreateUserResponse> createUser(CreateUserRequest createUserRequest) {
        return ResponseEntity.ok(userService.createUser(createUserRequest));
    }

    @Override
    public ResponseEntity<FindUserResponse> findUser(UUID userId) {
        return ResponseEntity.ok(userService.findUser(userId));
    }

    @Override
    public ResponseEntity<Void> updateUser(String userId, UpdateUserRequest updateUserRequest) {
        userService.updateUser(userId, updateUserRequest);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> deleteUser(String userId) {
        userService.deleteUser(userId);
        return ResponseEntity.ok().build();
    }

}
