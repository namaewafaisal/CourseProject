package com.courseapp.ourcourseplatform.rating;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "ratings")
public class Rating {
    private ObjectId id;
    private ObjectId userId;    
    private int rating;
    private String targetType;
    private ObjectId targetId;
    
}
