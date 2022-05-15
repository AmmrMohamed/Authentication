package com.sumerge.Authentication;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

//    findByEmail(String Email);
//    Optional<users> findByEmail(String Email);
//
//
//
//
//
//    Boolean existsByEmail(String Email);
//    Boolean existsByEmail(String Email);
}
