package com.view;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CourseReadyInfo {

    private long id;
    private String course;
    private int totalSlot;
    private String description;
    private double price;
    private long totalStudent;
    private long startAt;
    private String timeTable;
    private String image;
    private int status;
}
