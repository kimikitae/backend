package com.example.backend.Repository;

import com.example.backend.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUserId(String id);
}
