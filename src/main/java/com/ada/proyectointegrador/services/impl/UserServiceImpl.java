package com.ada.proyectointegrador.services.impl;

import com.ada.proyectointegrador.models.User;
import com.ada.proyectointegrador.services.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Tag(name = "User Service Implementation")
public class UserServiceImpl implements UserService {
    private Map<String, User> users = new HashMap<>();

    @Override
    public User createUser(User user) {
        users.put(user.getId(), user);
        return user;
    }

    @Override
    public User getUser(String id) {
        return users.get(id);
    }

    @Override
    public User updateUser(String id, User user) {
        users.put(id, user);
        return user;
    }

    @Override
    public void deleteUser(String id) {
        users.remove(id);
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }
}
