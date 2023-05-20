package com.example.backend.Repository;

import com.example.backend.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findBy(String id);
}
