package com.example.nxttrendz.service;

import com.example.nxttrendz.model.Product;
import com.example.nxttrendz.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public List<Product> getFilteredProducts(String sortBy, String category, String search, String rating) {
        List<Product> products = repo.findAll();

        if (category != null && !category.isEmpty())
            products = products.stream()
                    .filter(p -> p.getCategoryId().equals(Long.parseLong(category)))
                    .collect(Collectors.toList());

        if (search != null && !search.isEmpty())
            products = products.stream()
                    .filter(p -> p.getTitle().toLowerCase().contains(search.toLowerCase()))
                    .collect(Collectors.toList());

        if (rating != null && !rating.isEmpty())
            products = products.stream()
                    .filter(p -> p.getRating() >= Integer.parseInt(rating))
                    .collect(Collectors.toList());

        if ("PRICE_HIGH".equals(sortBy))
            products.sort((a, b) -> Double.compare(b.getPrice(), a.getPrice()));
        else if ("PRICE_LOW".equals(sortBy))
            products.sort((a, b) -> Double.compare(a.getPrice(), b.getPrice()));

        return products;
    }

    public Product getProductById(Long id) {
        return repo.findById(id).orElse(null);
    }
 // ProductService.java
    public List<Product> getPrimeDeals() {
        // EFFICIENT: Database handles the filtering using the custom method
        return repo.findByPrimeDealTrue(); 
    }
}
