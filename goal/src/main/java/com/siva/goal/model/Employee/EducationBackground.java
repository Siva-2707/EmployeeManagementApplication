package com.siva.goal.model.Employee;

import lombok.Data;

@Data
public class EducationBackground {

    private String courseName;
    private String institute;
    private String university;
    private int courseDuration;
    private String yearOfPassing;
    private double percentage;

    public EducationBackground(String courseName, String institute, String university, int courseDuration,
            String yearOfPassing, double percentage) {
        this.courseName = courseName;
        this.institute = institute;
        this.university = university;
        this.courseDuration = courseDuration;
        this.yearOfPassing = yearOfPassing;
        this.percentage = percentage;
    }

}
