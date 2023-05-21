package com.zay.fithub.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.zay.fithub.Entities.Catalog;

@Repository
public interface CatalogRepository extends MongoRepository<Catalog, Long> {

}
