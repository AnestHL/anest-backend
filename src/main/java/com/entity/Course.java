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
@Table(name="course")
public class Course{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="course")
    private String course;

    @Column(name="total_slot")
    private int totalSlot;

    @Column(name="short_description")
    private String shortDescription;

    @Column(name="description")
    private String description;

    @Column(name="benefit")
    private String benefit;

    @Column(name="price")
    private double price;

    @Column(name="image")
    private String image;

    @Column(name="status")
    private int status;
}
