package com.ada.proyectointegrador.services;

import com.ada.proyectointegrador.models.User;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "User Service")
public interface UserService {
    User createUser(User user);

    User getUser(String id);

    User updateUser(String id, User user);

    void deleteUser(String id);

    List<User> getAllUsers();
}
