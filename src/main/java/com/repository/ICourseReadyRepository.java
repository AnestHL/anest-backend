package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.entity.CourseReady;

@Repository
public interface ICourseReadyRepository extends JpaRepository<CourseReady, Long> {
}
