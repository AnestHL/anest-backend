package com.service;

import java.util.List;

import com.entity.Faq;

public interface IFaqService {
    List<Faq> getListFaqByCourseId(int courseId);
}
