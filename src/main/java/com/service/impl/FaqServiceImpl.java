package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IFaqDAO;
import com.service.IFaqService;
import com.entity.Faq;


@Service
public class FaqServiceImpl implements IFaqService {
    @Autowired
    private IFaqDAO iFaqDAO;

    @Override
    public List<Faq> getListFaqByCourseId(int courseId) {
        return iFaqDAO.getListFaqByCourseId(courseId);
    }
}
