package com.courseapp.ourcourseplatform.lesson;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Lessons")
public class LessonController {
    @Autowired
    private LessonService lessonService;
    
    @GetMapping("all")
    public List<Lesson> getLessons() {
        return lessonService.getLessons();
    }
    @PostMapping("add")
    public Lesson addLesson(@RequestBody Lesson lesson) {
        return lessonService.addLesson(lesson);
    }
}
    