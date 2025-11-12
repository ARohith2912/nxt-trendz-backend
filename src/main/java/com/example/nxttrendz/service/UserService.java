package com.example.nxttrendz.service;

import com.example.nxttrendz.model.User;
import com.example.nxttrendz.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<User> getAllUsers() {
        return repo.findAll();
    }


    // ✅ validate login credentials
    public boolean validateUser(String username, String password) {
        // EFFICIENT: Only fetches ONE user record from the database
        User user = repo.findByUsername(username); 

        // Basic check (NOTE: Passwords should be hashed in production!)
        return user != null && user.getPassword().equals(password);
    }
}
