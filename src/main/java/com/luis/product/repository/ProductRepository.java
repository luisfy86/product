package com.luis.product.repository;

import com.luis.product.model.Product;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
    @Cacheable
    List<Product> findByCatId(int catId);
}
