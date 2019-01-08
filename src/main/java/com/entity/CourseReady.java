package com.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CourseReady {
    private int id;
    private String courseName;
    private int totalSlot;
    private String description;
    private double price;
    private int totalStudent;
    private long startAt;
    private String timeTable;
    private String image;
    private int status;
}
