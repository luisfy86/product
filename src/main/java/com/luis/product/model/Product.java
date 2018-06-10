package com.luis.product.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;
//import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

//@Document(indexName = "product", type="external")
@Document
public class Product implements Serializable {

    @Id
    private String id;
    private String name;
    private int catId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }
}
