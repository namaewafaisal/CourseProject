package com.courseapp.ourcourseplatform.user;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profile {
    private String careerGoal;
    private List<String> skills;
    private List<String> interests;
    private String experience;
    private String education;
    private String achievements;
    private String certifications;
    private String projects;
    private String bio;
    private Map<String, String> socialLinks;

}
