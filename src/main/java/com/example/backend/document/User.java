package com.example.backend.document;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "people")
public class User {
    @Id
    private String uid;
    private String userId;
    private String password;
}
