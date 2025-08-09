package com.courseapp.ourcourseplatform.career;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courseapp.ourcourseplatform.ResourceNotFoundException;

@Service
public class CareerService {
    @Autowired
    private CareerRepository careerRepository;

    public List<Career> getCareers() {
        return careerRepository.findAll();
    }

    public Career addCareer(Career career) {
        return careerRepository.save(career);
    }
    public Career getCareerById(ObjectId id) {
        return careerRepository.findById(id).orElse(null);
    }
    public void deleteCareer(ObjectId id) {
        careerRepository.deleteById(id);    
    }
    public Career updateCareer(ObjectId id, Career career) {
        Career career2 = careerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Career not found with id: " + id)); 
        return careerRepository.save(career2);
    }
    public void deleteAllCareers() {
        careerRepository.deleteAll();
    }

}