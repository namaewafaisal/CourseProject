package com.courseapp.ourcourseplatform.career;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CareerRepository extends MongoRepository<Career, ObjectId> {

}
