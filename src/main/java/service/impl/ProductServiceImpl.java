package service.impl;

import model.Product;
import org.springframework.stereotype.Service;
import service.ProductService;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    public Product getProduct(int id) {
        Product product = new Product();
        product.setId(id);
        product.setName("test");
        return product;
    }

    public List<Integer> getProductIds(int id) {
        return Arrays.asList(id+1,id+2,id+3);
    }
}
