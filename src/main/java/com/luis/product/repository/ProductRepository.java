package com.luis.product.repository;

import com.luis.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> { //MongoDB repository
//public interface ProductRepository extends ElasticsearchRepository<Product, String> {
    List<Product> findByCatId(int catId);
}
