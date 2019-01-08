package com.dao.impl;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.dao.ICourseDAO;
import com.entity.Course;

@Repository
public class CourseDAOImpl implements ICourseDAO {
	@Override
	public List<Course> getAllCourse() {
		List<Course> list = CourseDAOImpl.mockData();
		return list;
	}

	@Override
	public Course getCourseById(int courseId) {
		List<Course> list = CourseDAOImpl.mockData();
		for(Course course : list){
			if(course.getId() == courseId)
				return course;
		}
		return null;
	}

	private static List<Course> mockData() {
		List<Course> list = new ArrayList<>();

		String js = "Javascript (JS) đang là một trong số các ngôn ngữ được yêu thích và phổ biến nhất trên thế giới. Nắm vững cơ bản về JS sẽ tạo cho bạn một nền tảng tốt cho lập trình web, bạn có thể trở thành fullstack developer với JS và học các framework hot nhất hiện nay.";
		String html = "Bạn muốn xây dựng nên một trang web đơn giản hay phức tạp đều không thể thiếu HTML/CSS. Khóa học này sẽ cung cấp cho bạn những kiến thức cơ bản, cần thiết nhất để bắt đầu trên con đường trở thành một lập trình viên web chuyên nghiệp.";
		String git = "Git là một công cụ quản lý source rất nổi tiếng hiện nay, thậm chí bây giờ các nhà tuyển dụng còn đưa Git vào giống như một tiêu chuẩn khi tuyển dụng, vì vậy việc nắm bắt công cụ này là điều cần thiết với các lập trình viên hiện này.";

		list.add(new Course(1, "Java Core Basic", 10, "Java Core Basic", "", "", 1000000, "v4.jpg", 1));
		list.add(new Course(2, "Java Core Advanced", 10, "Java Core Advanced", "", "", 1000000, "v2.jpg", 1));
		list.add(new Course(3, "Javascript Basic", 10, js, "", "", 7500000, "c-js.jpg", 1));
		list.add(new Course(4, "Database", 8, "Database", "", "", 1000000, "c-database.jpg", 1));
		list.add(new Course(5, "HTML/CSS", 10, html, "", "", 1000000, "c-html.jpg", 1));
		list.add(new Course(6, "Làm việc với Git", 4, git, "", "", 0, "c-git.jpg", 1));
		return list;
	}
}
