package com.luis.product.service;

import com.luis.product.model.Product;

import java.util.List;

public interface ProductService {

    public Product getProduct(int id);
    public List<Integer> getProductIds(int id);
    List<Product> getProductsForCategory(int id);

    Product saveProduct(Product product);

    Product updateProduct(Product product, int id);

    void deleteProduct(int id);
}
