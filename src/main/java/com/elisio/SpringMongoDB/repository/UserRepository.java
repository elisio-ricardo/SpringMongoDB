package com.elisio.SpringMongoDB.repository;

import com.elisio.SpringMongoDB.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends MongoRepository<User, String> {

}