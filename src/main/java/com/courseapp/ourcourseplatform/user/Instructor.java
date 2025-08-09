package com.courseapp.ourcourseplatform.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Instructor {
    private String specialization;
    private String qualification;
    private String bio;
    private String teachingExperience;
    private int followersCount;
    private float rating;
    private int ratingsCount;
    private int coursesTaught;
    private int studentsTaught;
    private String teachingStyle;
    private String contactInfo;
}
