package com.service.impl;

import java.util.List;

import com.repository.IFaqRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private IFaqRepository iFaqRepository;

    @Override
    public List<Faq> getListFaqByCourseId(long courseId) {
        String hql = "FROM Faq as F WHERE F.courseId = ?";
        Query query = entityManager.createQuery(hql);
        query.setParameter(1, courseId);
        return (List<Faq>) query.getResultList();
    }

    @Override
    public Faq getFaq(long id) {
        return iFaqRepository.findOne(id);
    }

    @Override
    public Faq addFaq(Faq faq) {
        return iFaqRepository.save(faq);
    }

    @Override
    public Faq updateFaq(Faq faq) {
        return iFaqRepository.save(faq);
    }
}
