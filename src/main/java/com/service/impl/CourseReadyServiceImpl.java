package com.service.impl;

import java.util.List;

import com.repository.ICourseReadyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.ICourseReadyService;
import com.entity.CourseReady;

@Service
public class CourseReadyServiceImpl implements ICourseReadyService {
    @Autowired
    private ICourseReadyRepository iCourseReadyRepository;

    @Override
    public List<CourseReady> getAllCourseReady() {
        return iCourseReadyRepository.findAll();
    }
}
