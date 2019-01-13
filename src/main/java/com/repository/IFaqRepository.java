package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.entity.Faq;

@Repository
public interface IFaqRepository extends JpaRepository<Faq, Long> {
}
