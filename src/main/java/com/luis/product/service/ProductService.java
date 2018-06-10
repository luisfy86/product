package com.luis.product.service;

import com.luis.product.model.Product;

import java.util.List;

public interface ProductService {

    Product getProduct(String id);

    List<Product> getProductsForCategory(int id);

    Product saveProduct(Product product);

    Product updateProduct(Product product, String id);

    void deleteProduct(String id);
}
