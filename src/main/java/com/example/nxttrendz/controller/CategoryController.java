package com.example.nxttrendz.controller;

import com.example.nxttrendz.model.Category;
import com.example.nxttrendz.repository.CategoryRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/categories")
@CrossOrigin(origins = {
        "http://localhost:3000", // local React dev
        "https://ecommerce-mu-beryl-47.vercel.app" // deployed frontend on Vercel
})
public class CategoryController {
    private final CategoryRepository repo;
    public CategoryController(CategoryRepository repo) { this.repo = repo; }

    @GetMapping
    public List<Category> getAll() { return repo.findAll(); }
}
