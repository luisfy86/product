package service;

import model.Product;

import java.util.List;

public interface ProductService {

    public Product getProduct(int id);
    public List<Integer> getProductIds(int id);
}
