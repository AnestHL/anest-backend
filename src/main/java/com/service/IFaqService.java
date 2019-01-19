package com.service;

import java.util.List;

import com.entity.Faq;

public interface IFaqService {
    List<Faq> getListFaqByCourseId(long courseId);

    Faq getFaq(long id);

    Faq addFaq(Faq faq);

    Faq updateFaq(Faq faq);
}
