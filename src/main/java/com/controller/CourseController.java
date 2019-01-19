package com.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.ICourseService;
import com.entity.Course;

import com.util.ApiMessages;

@Controller
@RequestMapping("course")
public class CourseController {
	private ICourseService courseService;

	@Autowired
	public CourseController(ICourseService courseService) {
		this.courseService = courseService;
	}

	@GetMapping("{id}")
	public ResponseEntity<?> getCourseById(@PathVariable("id") long id) {
		Course course = courseService.getCourseById(id);
		if(course == null){
			ApiMessages message = new ApiMessages("not found course id: " + id);
			return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
		}
		else{
			return new ResponseEntity<>(course, HttpStatus.OK);
		}
	}

	@GetMapping("all")
	public ResponseEntity<List<Course>> getAllCourse() {
		List<Course> list = courseService.getAllCourse();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
} 