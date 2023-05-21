package com.zay.fithub.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zay.fithub.Entities.Product;
import com.zay.fithub.Repositories.ProductRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product cart) {
        return productRepository.save(cart);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Cart not found with id: " + id));
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
