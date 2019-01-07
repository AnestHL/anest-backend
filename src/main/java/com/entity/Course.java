package com.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Course {
    private int id;
    private String courseName;
    private int totalSlot;
    private String shortDescription;
    private String description;
    private String benefit;
    private double price;
    private String image;
    private int status;
}
