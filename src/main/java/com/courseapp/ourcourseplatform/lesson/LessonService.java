package com.courseapp.ourcourseplatform.lesson;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {
    @Autowired
    private LessonRepository lessonRepository;

    public List<Lesson> getLessons() {
        return lessonRepository.findAll();
    }

    public Lesson addLesson(Lesson lesson) {
        return lessonRepository.save(lesson);
    }
}
