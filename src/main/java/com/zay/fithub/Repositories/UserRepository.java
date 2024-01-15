package com.zay.fithub.Repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.zay.fithub.Entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findById(String id);
}
