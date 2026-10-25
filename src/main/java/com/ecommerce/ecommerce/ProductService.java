package com.ecommerce.ecommerce;

import java.util.List;
import org.springframework.stereotype.Service;
import java.util.Optional;
@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
    public Optional<Product> getProductById(int id) {
        return productRepository.findById(id);
    }

public Product updateProduct(int id, Product updatedProduct) {
    Product existingProduct = productRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Product not found"));

    existingProduct.setProductname(updatedProduct.getProductname());
    existingProduct.setDescription(updatedProduct.getDescription());
    existingProduct.setPrice(updatedProduct.getPrice());
    existingProduct.setStock(updatedProduct.getStock());
    existingProduct.setCategoryid(updatedProduct.getCategoryid());

    return productRepository.save(existingProduct);
}
public void deleteProduct(int id) {
    Product product = productRepository.findById(id)
            .orElseThrow(() ->
                    new RuntimeException("Product not found"));

    productRepository.delete(product);
}

public List<Product> getProductsByName(String productname) {
    return productRepository.findByProductname(productname);
}
}
