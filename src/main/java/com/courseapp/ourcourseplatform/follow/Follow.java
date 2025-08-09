package com.courseapp.ourcourseplatform.follow;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "follows")
public class Follow {
    private ObjectId followerId;
    private ObjectId followingId;
    private String createdAt;
}
