package com.courseapp.ourcourseplatform.course;
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
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/all")
    public List<Course> getCourses() {
        return courseService.getCourses();
    }
    @PostMapping("/add")
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }
    @GetMapping("/{id}/get")
    public Course getCourseById(@PathVariable ObjectId id) {
        return courseService.getCourseById(id);
    }
    @DeleteMapping("/{id}/delete")
    public void deleteCourse(@PathVariable ObjectId id) {
        courseService.deleteCourse(id);
    }
    @PutMapping("/{id}/update")
    public Course updateCourse(@PathVariable ObjectId id, @RequestBody Course course) {
        return courseService.updateCourse(id, course);
    }
    @DeleteMapping("/deleteAll")
    public void deleteAllCourses() {
        courseService.deleteAllCourses();
    }
    
}
    