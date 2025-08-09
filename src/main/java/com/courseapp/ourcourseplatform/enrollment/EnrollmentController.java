package com.courseapp.ourcourseplatform.enrollment;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {
    @Autowired
    private EnrollmentService enrollmentService;

    @GetMapping("all")
    public List<Enrollment> getEnrollments() {
        return enrollmentService.getEnrollments();
    }
    @PostMapping("add")
    public Enrollment addEnrollment(@RequestBody Enrollment enrollment) {
        return enrollmentService.addEnrollment(enrollment);
    }
    @GetMapping("/{id}/get")
    public Enrollment getEnrollmentById(@PathVariable ObjectId id) {
        return enrollmentService.getEnrollmentById(id);
    }
    @DeleteMapping("/{id}/delete")
    public void deleteEnrollment(@PathVariable ObjectId id) {
        enrollmentService.deleteEnrollment(id);
    }
    @PutMapping("/{id}/update")
    public Enrollment updateEnrollment(@PathVariable ObjectId id, @RequestBody Enrollment enrollment) {
        return enrollmentService.updateEnrollment(id, enrollment);
    }
    @DeleteMapping("/deleteAll")
    public void deleteAllEnrollments() {
        enrollmentService.deleteAllEnrollments();
    }
}
    