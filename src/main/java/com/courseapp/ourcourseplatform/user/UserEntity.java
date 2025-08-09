package com.courseapp.ourcourseplatform.user;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users")
public class UserEntity {
    @Id
    private ObjectId id;
    private String username;
    private String email;
    private String password;
    private String role;
    private String profilePictureUrl;
    private String createdAt;
    private String updatedAt;
    private Profile profile;
    private Instructor instructor;
    private Social social;
}
