package com.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Faq {
    private int id;
    private int courseId;
    private String question;
    private String answer;
}
