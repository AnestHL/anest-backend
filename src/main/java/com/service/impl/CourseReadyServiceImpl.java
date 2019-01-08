package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ICourseReadyDAO;
import com.service.ICourseReadyService;
import com.entity.CourseReady;

@Service
public class CourseReadyServiceImpl implements ICourseReadyService {
    @Autowired
    private ICourseReadyDAO iCourseReadyDAO;

    @Override
    public List<CourseReady> getAllCourseReady() {
        return iCourseReadyDAO.getAllCourseReady();
    }
}
