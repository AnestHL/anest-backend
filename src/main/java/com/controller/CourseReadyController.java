package com.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.ICourseReadyService;
import com.entity.CourseReady;

@Controller
@RequestMapping("course-ready")
public class CourseReadyController {
	private ICourseReadyService iCourseReadyService;

	@Autowired
	public CourseReadyController(ICourseReadyService iCourseReadyService) {
		this.iCourseReadyService = iCourseReadyService;
	}

	@GetMapping("all")
	public ResponseEntity<List<CourseReady>> getAllCourseReady() {
		List<CourseReady> list = iCourseReadyService.getAllCourseReady();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
} 