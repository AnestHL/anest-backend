package com.service;

import java.util.List;

import com.entity.Course;

public interface ICourseService {
     /**
      * get all course
      * @return list course
      */
     List<Course> getAllCourse();

     /**
      *
      * @param id input course id
      * @return Course
      */
     Course getCourseById(int id);
}
