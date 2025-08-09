package com.courseapp.ourcourseplatform.lesson;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LessonRepository extends MongoRepository<Lesson, ObjectId> {

}
