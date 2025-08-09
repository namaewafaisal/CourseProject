package com.courseapp.ourcourseplatform.course;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CourseRepository extends MongoRepository<Course, ObjectId> {

}
