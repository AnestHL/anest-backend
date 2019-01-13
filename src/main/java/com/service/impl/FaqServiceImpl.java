package com.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.service.IFaqService;
import com.entity.Faq;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Service
public class FaqServiceImpl implements IFaqService {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Faq> getListFaqByCourseId(int courseId) {
        String hql = "FROM Faq as F WHERE F.courseId = ?";
        Query query = entityManager.createQuery(hql);
        query.setParameter(1, courseId);
        return (List<Faq>) query.getResultList();
    }
}
