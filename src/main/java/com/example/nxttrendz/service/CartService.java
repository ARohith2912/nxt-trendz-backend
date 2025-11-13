package com.example.nxttrendz.service;

import com.example.nxttrendz.model.CartItem;
import com.example.nxttrendz.model.Product;
import com.example.nxttrendz.model.User;
import com.example.nxttrendz.repository.CartItemRepository;
import com.example.nxttrendz.repository.ProductRepository;
import com.example.nxttrendz.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CartService {
    
    // Injecting all necessary repositories
    @Autowired
    private CartItemRepository cartItemRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private UserRepository userRepository;
    
    

    // ... (Existing getCartItems and addItemToCart methods remain unchanged)

    // ✅ NEW: Removes a specific item from the cart
    public void removeItemFromCart(Long userId, Long cartItemId) {
        // 1. Find the cart item
        CartItem item = cartItemRepository.findById(cartItemId).orElse(null);

        // 2. Validate that the item exists and belongs to the specified user
        if (item != null && item.getUser().getId().equals(userId)) {
            cartItemRepository.delete(item);
        } else {
            // In a real application, throw an exception (e.g., ResourceNotFoundException or ForbiddenException)
            System.out.println("Error: Cart item not found or does not belong to user."); 
        }
    }

    // ✅ NEW: Clears all items from a user's cart
    public void clearCart(Long userId) {
        // 1. Get all items belonging to the user
        List<CartItem> cartItems = cartItemRepository.findByUserId(userId);

        // 2. Delete all found items
        if (!cartItems.isEmpty()) {
            cartItemRepository.deleteAll(cartItems);
        }
    }
    
    // ... (The rest of the existing code for getCartItems and addItemToCart)
    public List<CartItem> getCartItems(Long userId) { 
        return cartItemRepository.findByUserId(userId); 
    }

    public CartItem addItemToCart(Long userId, Long productId, int quantity) {

        // 1️⃣ Fetch user and product from database
        User user = userRepository.findById(userId).orElse(null);
        Product product = productRepository.findById(productId).orElse(null);

        if (user == null || product == null || quantity <= 0) {
            throw new IllegalArgumentException("Invalid user, product, or quantity");
        }

        // 2️⃣ Check availability status
        if (product.getAvailability() != null &&
            product.getAvailability().equalsIgnoreCase("Out of Stock")) {
            throw new RuntimeException("Product is out of stock and cannot be added to cart");
        }

        // 3️⃣ Check if cart item already exists for this product and user
        CartItem existingItem = cartItemRepository.findByUserIdAndProductId(userId, productId);

        if (existingItem != null) {
            existingItem.setQuantity(existingItem.getQuantity() + quantity);
            return cartItemRepository.save(existingItem);
        } else {
            CartItem newItem = new CartItem();
            newItem.setUser(user);
            newItem.setProduct(product);
            newItem.setProductName(product.getTitle());
            newItem.setPrice(product.getPrice().floatValue());
            newItem.setQuantity(quantity);
            return cartItemRepository.save(newItem);
        }
    }

}