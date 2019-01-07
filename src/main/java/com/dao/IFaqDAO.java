package com.dao;

import java.util.List;

import com.entity.Faq;

public interface IFaqDAO {
    List<Faq> getListFaqByCourseId(int courseId);
}
