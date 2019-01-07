package com.dao;

import java.util.List;

import com.entity.Course;

public interface ICourseDAO {
    List<Course> getAllCourse();
    Course getCourseById(int courseId);
}
 