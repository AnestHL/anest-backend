package com.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="course_ready")
public class CourseReady {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="course_code")
    private String courseCode;

    @Column(name="course_id")
    private int courseId;

    @Column(name="total_student")
    private int totalStudent;

    @Column(name="start_at")
    private long startAt;

    @Column(name="time_table")
    private String timeTable;

    @Column(name="image")
    private String image;

    @Column(name="status")
    private int status;
}
