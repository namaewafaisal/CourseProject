package com.courseapp.ourcourseplatform.course;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "courses")
public class Course {
    @Id
    private ObjectId id;
    private String title;
    private String description;
    private String thumbnailUrl;
    private List<ObjectId> careerIds;
    private List<String> prerequisites;
    private List<String> priorKnowledge;
    private ObjectId instructorId;
    private int views;
    private int rating;
    private int ratingCount;
    
    
    
}
