package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ICourseDAO;
import com.service.ICourseService;
import com.entity.Course;

@Service
public class CourseServiceImpl implements ICourseService {
    @Autowired
	private ICourseDAO iCourseDAO;

	@Override
	public Course getCourseById(int courseId) {
		return iCourseDAO.getCourseById(courseId);
	}

	@Override
	public List<Course> getAllCourse(){
		return iCourseDAO.getAllCourse();
	}

}
