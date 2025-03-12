package com.backend.zylentrix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.zylentrix.model.Users;
import com.backend.zylentrix.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // 1. Retrieve All Users
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    // 2. Create a User
    public Users createUser(String name, String email, int age) {

        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Please enter name");
        }

        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Please enter email");
        }
        if (userRepository.existsByEmail(email)) {
            throw new IllegalArgumentException("Email already registered");
        }

        Users user = new Users();
        user.setName(name);
        user.setEmail(email);
        user.setAge(age);
        return userRepository.save(user);

    }

    // 3. Retrieve a Single User by id
    public Users singleUser(long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
    }

    // 4. Update a User by id
    public Users updateUser(Users user, long id) {
        Users updateUser = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        updateUser.setName(user.getName());
        updateUser.setEmail(user.getEmail());
        updateUser.setAge(user.getAge());

        return userRepository.save(updateUser);
    }

    // 5. Delete a User by id
    public void deleteUser(long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            throw new IllegalArgumentException("User not found");
        }
    }

}
