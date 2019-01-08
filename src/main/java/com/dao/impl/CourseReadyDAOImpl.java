package com.dao.impl;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.dao.ICourseReadyDAO;
import com.entity.CourseReady;

@Repository
public class CourseReadyDAOImpl implements ICourseReadyDAO {
    @Override
    public List<CourseReady> getAllCourseReady() {
        List<CourseReady> list = CourseReadyDAOImpl.mockData();
        return list;
    }

    private static List<CourseReady> mockData() {
        List<CourseReady> list = new ArrayList<>();

        list.add(new CourseReady(1, "Java Core Basic", 10, "", 1000000, 30, 1551571200, "", "c-js-v.jpg", 1));
        list.add(new CourseReady(2, "Java Core Advanced", 10, "", 1000000, 30, 1551571200, "", "c-js-v.jpg", 1));
        list.add(new CourseReady(3, "HTML/CSS", 10, "", 1000000, 30, 1551571200, "", "c-html-v.jpg", 1));
        list.add(new CourseReady(4, "Git", 4, "", 1000000, 30, 1551571200, "", "c-js-v.jpg", 1));
        return list;
    }
}
