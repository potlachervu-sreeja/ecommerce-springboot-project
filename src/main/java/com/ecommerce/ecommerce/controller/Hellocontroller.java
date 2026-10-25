
package com.ecommerce.ecommerce.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ecommerce.ecommerce.Product;
import com.ecommerce.ecommerce.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class Hellocontroller {
	private final ProductService productService;

	public Hellocontroller(ProductService productService) {
	    this.productService = productService;
	}
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello! My E-Commerce Spring Boot Application is working.";
    }
    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }
   
    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(
            @PathVariable int id) {

        return productService.getProductById(id)
                .map(product -> ResponseEntity.ok(product))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
    @PostMapping("/products")
    public ResponseEntity<Product> addProduct(
            @RequestBody Product product) {

        Product savedProduct = productService.saveProduct(product);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedProduct);
    }

@PutMapping("/products/{id}")
public Product updateProduct(
        @PathVariable int id,
        @RequestBody Product product) {
    return productService.updateProduct(id, product);
}
@DeleteMapping("/products/{id}")
public String deleteProduct(@PathVariable int id) {
    productService.deleteProduct(id);
    return "Product deleted successfully";
}
@GetMapping("/products/search")
public List<Product> searchProducts(
        @RequestParam String name) {
    return productService.getProductsByName(name);
}

}
