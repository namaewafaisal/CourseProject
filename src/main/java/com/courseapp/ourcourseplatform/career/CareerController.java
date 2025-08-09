package com.courseapp.ourcourseplatform.career;
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
@RequestMapping("/careers")
public class CareerController {
    @Autowired
    private CareerService careerService;
    
    @GetMapping("/all")
    public List<Career> getCareers() {
        return careerService.getCareers();
    }
    @PostMapping("/add")
    public Career addCareer(@RequestBody Career career) {
        return careerService.addCareer(career);
    }
    @GetMapping("/{id}/get")
    public Career getCareerById(@PathVariable ObjectId id) {
        return careerService.getCareerById(id);
    }
    @DeleteMapping("/{id}/delete")
    public void deleteCareer(@PathVariable ObjectId id) {
        careerService.deleteCareer(id);
    }
    @PutMapping("/{id}/update")
    public Career updateCareer(@PathVariable ObjectId id, @RequestBody Career career) {
        return careerService.updateCareer(id, career);
    }
    @DeleteMapping("/deleteAll")
    public void deleteAllCareers() {
        careerService.deleteAllCareers();
    }
}
    