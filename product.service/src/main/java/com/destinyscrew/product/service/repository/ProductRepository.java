package com.destinyscrew.product.service.repository;

import com.destinyscrew.product.service.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
