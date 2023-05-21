package com.zay.fithub.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.zay.fithub.Entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {

}
