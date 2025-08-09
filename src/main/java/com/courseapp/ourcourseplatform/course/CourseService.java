package com.courseapp.ourcourseplatform.course;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courseapp.ourcourseplatform.ResourceNotFoundException;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }
    public Course getCourseById(ObjectId id) {
        return courseRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Course not found with id: " + id));
    }
    public void deleteCourse(ObjectId id) {
        courseRepository.deleteById(id);
    }
    public Course updateCourse(ObjectId id, Course course) {
        Course existingCourse = courseRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Course not found with id: " + id));
        return courseRepository.save(existingCourse);
    }
    public void deleteAllCourses() {
        courseRepository.deleteAll();
    }
    
}
