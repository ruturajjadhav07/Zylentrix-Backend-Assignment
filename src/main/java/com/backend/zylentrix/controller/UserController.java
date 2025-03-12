package com.backend.zylentrix.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.backend.zylentrix.model.Users;
import com.backend.zylentrix.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // Retrieve All Users
    @GetMapping
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    // Create user
    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody Users user) {
        userService.createUser(user.getName(), user.getEmail(), user.getAge());
        return ResponseEntity.ok("User created successfully!");
    }

    // Retrieve a single user by id
    @GetMapping("/{id}")
    public ResponseEntity<Users> singleUser(@PathVariable long id) {
        Users user = userService.singleUser(id);
        return ResponseEntity.ok(user);
    }

    // Update a user by id
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateUser(@RequestBody Users user, @PathVariable long id) {
        userService.updateUser(user, id);
        return ResponseEntity.ok("User updated successfully!");
    }

    // Delete a user by id
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok("User deleted successfully!");
    }
}
