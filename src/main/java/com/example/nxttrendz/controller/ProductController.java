package com.example.nxttrendz.controller;

import com.example.nxttrendz.model.Product;
import com.example.nxttrendz.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // GET all products with filters
    @GetMapping
    public List<Product> getAllProducts(
        @RequestParam(required = false) String sort_by,
        @RequestParam(required = false) String category,
        @RequestParam(required = false) String title_search,
        @RequestParam(required = false) String rating
    ) {
        return productService.getFilteredProducts(sort_by, category, title_search, rating);
    }

    // GET product by ID
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    // GET prime deals (discounted)
    @GetMapping("/prime")
    public List<Product> getPrimeDeals() {
        return productService.getPrimeDeals();
    }
}
