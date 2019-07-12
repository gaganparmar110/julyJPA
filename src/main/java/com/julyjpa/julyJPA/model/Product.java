package com.julyjpa.julyJPA.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Product {
    @Id
    private Integer id;

    private String productName;
    private  String price;

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) { this.productName = productName; }

    public String getPrice() { return price; }

    public void setPrice(String price) {
        this.price = price;
    }
}
