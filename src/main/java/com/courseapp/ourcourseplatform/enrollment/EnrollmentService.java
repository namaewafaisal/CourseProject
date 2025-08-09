package com.courseapp.ourcourseplatform.enrollment;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courseapp.ourcourseplatform.ResourceNotFoundException;

@Service
public class EnrollmentService {
    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public List<Enrollment> getEnrollments() {
        return enrollmentRepository.findAll();
    }

    public Enrollment addEnrollment(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }
    public Enrollment getEnrollmentById(ObjectId id) {
        return enrollmentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Enrollment not found with id: " + id));
    }
    public void deleteEnrollment(ObjectId id) {
        enrollmentRepository.deleteById(id);
    }
    public Enrollment updateEnrollment(ObjectId id, Enrollment enrollment) {
        Enrollment existingEnrollment = enrollmentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Enrollment not found with id: " + id));
        return enrollmentRepository.save(existingEnrollment);
    }
    public void deleteAllEnrollments() {
        enrollmentRepository.deleteAll();
    }
}
