package com.julyjpa.julyJPA.repositry;

import com.julyjpa.julyJPA.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer>  //entity and type of entity
{

}
