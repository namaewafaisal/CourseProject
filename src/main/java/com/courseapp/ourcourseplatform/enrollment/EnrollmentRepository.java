package com.courseapp.ourcourseplatform.enrollment;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EnrollmentRepository extends MongoRepository<Enrollment, ObjectId> {

}
