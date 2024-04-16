package com.java.sport.service;
import com.java.sport.model.Product;
import com.java.sport.repository.ProductRepo;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;
    

    public Product createProduct(@NonNull Product product) {
        return productRepo.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product getProductById(@NonNull Integer id) {
        return productRepo.findById(id).orElse(null);
    }

    public boolean updateProduct(int id, Product product) {
        if (getProductById(id) == null) {
            return false;
        }
        try {
            productRepo.save(product);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean deleteProduct(int id) {
        if (getProductById(id) == null) {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
}

