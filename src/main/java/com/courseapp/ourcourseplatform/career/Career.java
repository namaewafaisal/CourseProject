package com.courseapp.ourcourseplatform.career;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "careers")
public class Career{
    @Id
    private ObjectId id;
    private String title;
    private String description;
    private String difficulty;
    private ObjectId[] careerExperts;
    private ObjectId[] careerInstructors;
    

}
