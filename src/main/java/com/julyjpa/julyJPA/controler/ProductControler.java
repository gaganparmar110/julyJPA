package com.julyjpa.julyJPA.controler;

import com.julyjpa.julyJPA.model.Product;
import com.julyjpa.julyJPA.repositry.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProductControler {
    @Autowired
    private ProductRepo productRepo;

    @PostMapping(value = "/saveproduct")
    public String saveproduct(@RequestBody Product product){
       productRepo.save(product);
       return "Product Saved";
    }
    @GetMapping(value="/getproduct/{id}")
    public Optional<Product> getProduct(@PathVariable Integer id){
        Optional<Product> p=productRepo.findById(id);
        return p;
    }


}
