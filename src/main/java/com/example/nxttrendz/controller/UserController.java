package com.example.nxttrendz.controller;

import com.example.nxttrendz.model.User;
import com.example.nxttrendz.service.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/auth") // ✅ matches frontend URL
@CrossOrigin(origins = "http://localhost:3000") // or 5173 if using Vite
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    // ✅ LOGIN endpoint (used by your React frontend)
    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> loginRequest) {
        String username = loginRequest.get("username");
        String password = loginRequest.get("password");

        Map<String, String> response = new HashMap<>();

        boolean isAuthenticated = service.validateUser(username, password);

        if (isAuthenticated) {
            response.put("jwt_token", "dummy-jwt-token-12345");
        } else {
            response.put("error_msg", "Invalid username or password");
        }

        return response;
    }

    // ✅ Optional - fetch all users (for admin/testing)
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }
}
