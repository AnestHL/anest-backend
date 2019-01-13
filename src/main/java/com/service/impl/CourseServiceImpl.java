package com.service.impl;

import java.util.List;

import com.repository.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.ICourseService;
import com.entity.Course;

@Service
public class CourseServiceImpl implements ICourseService {
	@Autowired
	private ICourseRepository ICourseRepository;

	@Override
	public List<Course> getAllCourse(){
		return ICourseRepository.findAll();
	}

	@Override
	public Course getCourseById(int courseId) {
		return null;
	}


}
