package com.example.nxttrendz.controller;

import com.example.nxttrendz.model.CartItem;
import com.example.nxttrendz.service.CartService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = {
        "http://localhost:3000", // local React dev
        "https://ecommerce-mu-beryl-47.vercel.app" // deployed frontend on Vercel
})
public class CartController {
    private final CartService service;
    public CartController(CartService service) { this.service = service; }

    // GET cart items for a specific user
    @GetMapping("/{userId}")
    public List<CartItem> getCartItems(@PathVariable Long userId) { 
        return service.getCartItems(userId); 
    }

    // POST: Add an item to the cart for a specific user
    @PostMapping("/{userId}/add")
    public CartItem addItemToCart(
        @PathVariable Long userId,
        @RequestBody Map<String, Object> request
    ) {
        Long productId = ((Number) request.get("productId")).longValue();
        Integer quantity = (Integer) request.getOrDefault("quantity", 1);
        
        return service.addItemToCart(userId, productId, quantity);
    }
    
    // ✅ NEW: DELETE a specific item from the cart
    @DeleteMapping("/{userId}/item/{cartItemId}")
    public void removeItemFromCart(
        @PathVariable Long userId,
        @PathVariable Long cartItemId
    ) {
        service.removeItemFromCart(userId, cartItemId);
    }

    // ✅ NEW: DELETE (Clear) the entire cart
    @DeleteMapping("/{userId}")
    public void clearCart(@PathVariable Long userId) {
        service.clearCart(userId);
    }
}