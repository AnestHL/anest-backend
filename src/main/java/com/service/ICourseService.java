package com.service;

import java.util.List;

import com.entity.Course;

public interface ICourseService {
     List<Course> getAllCourse();
     Course getCourseById(int id);
}
