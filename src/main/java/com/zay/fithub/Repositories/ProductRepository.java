package com.zay.fithub.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.zay.fithub.Entities.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

}
