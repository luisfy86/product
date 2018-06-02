package com.luis.product.web;

import com.luis.product.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.luis.product.service.ProductService;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/${env}product/{id}")
    Product getProduct(@PathVariable("id")int id){
        return productService.getProduct(id);
    }

    @RequestMapping("/${env}productIds")
    List<Integer> getProductIds(@RequestParam("id")int id){
        return productService.getProductIds(id);
    }
}
