package com.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.entity.Course;

public class RestClientUtil {
    public void getAllCoursesDemo() {
        String url = "http://localhost:8080/course/all";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> requestEntity = new HttpEntity<>(headers);
        ResponseEntity<Course[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Course[].class);

        Course[] courses = responseEntity.getBody();
        for(Course course : courses) {
            System.out.println("Id: "+course.getId()+"Name: "+course.getCourse());
        }
    }

    public static void main(String args[]) {
        RestClientUtil util = new RestClientUtil();
        util.getAllCoursesDemo();
    }
}
