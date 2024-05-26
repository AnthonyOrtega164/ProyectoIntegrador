package com.ada.proyectointegrador.controllers;

import com.ada.proyectointegrador.models.User;
import com.ada.proyectointegrador.services.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Tag(name = "User Controller")
public class UserController {
    @Autowired
    private UserService userService;

    @Operation(summary="Create User")
    @PostMapping("/createUser/")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @Operation(summary="Get User")
    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable String id) {
        return userService.getUser(id);
    }

    @Operation(summary="Update User")
    @PutMapping("/updateUser/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @Operation(summary="Delete User")
    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
    }

    @Operation(summary="Get All Users")
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
