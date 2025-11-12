package com.example.nxttrendz.repository;

import com.example.nxttrendz.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
	// ✅ Existing: Fetches all cart items for a specific user ID
    List<CartItem> findByUserId(Long userId); 
    
    // ✅ NEW: Finds a specific item in a user's cart (used for updating quantity)
    CartItem findByUserIdAndProductId(Long userId, Long productId);
}
