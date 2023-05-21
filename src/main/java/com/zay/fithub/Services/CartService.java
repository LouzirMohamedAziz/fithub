package com.zay.fithub.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zay.fithub.Entities.Cart;
import com.zay.fithub.Repositories.CartRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CartService {
    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Cart createCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }

    public Cart getCartById(Long id) {
        return cartRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Cart not found with id: " + id));
    }

    public void deleteCart(Long id) {
        cartRepository.deleteById(id);
    }

}
