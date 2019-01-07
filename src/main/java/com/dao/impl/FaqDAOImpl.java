package com.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dao.IFaqDAO;
import com.entity.Faq;

@Repository
public class FaqDAOImpl implements IFaqDAO {
    @Override
    public List<Faq> getListFaqByCourseId(int courseId) {
        List<Faq> list = FaqDAOImpl.mockData();
        List<Faq> listResult = new ArrayList<>();
        for(Faq faq : list){
            if(faq.getCourseId() == courseId)
                listResult.add(faq);
        }
        return listResult;
    }

    private static List<Faq> mockData() {
        List<Faq> list = new ArrayList<>();
        list.add(new Faq(1, 0, "Đối tượng của ANEST là những ai?", "ANEST có tất cả các khóa học dành cho mọi đối tượng, những người mới bắt đầu học lập trình, những người đã có kiến thức căn bản hay là những người muốn học để đi làm. Hãy liên hệ với ANEST để được tư vấn khóa học phù hợp nhất với bạn."));
        list.add(new Faq(2, 0, "Khi đi học cần chuẩn bị những gì?", "Bạn chỉ cần chuẩn bị máy tính xách tay để thực hành code và giấy bút để ghi chép lại những kiến thức quan trọng."));
        list.add(new Faq(3, 0, "Nếu trong quá trình học có việc bận đột xuất thì có được học bù không?", "Bạn hoàn toàn có thể đi học bù vào các lớp cùng khóa đang mở. Nếu không có lớp - ANEST sẽ sắp xếp mentor dạy bù riêng cho bạn vào thời gian thích hợp. Trong trường hợp bạn có việc phải nghỉ cả khóa học, bạn hoàn toàn có thể học lại khóa học đó hoàn toàn miễn phí. Ở ANEST - bạn chỉ cần bỏ tiền duy nhất cho một khóa học và có thể học lại bao nhiêu lần không giới hạn."));
        list.add(new Faq(4, 0, "Khi có câu hỏi hoặc thắc mắc liên quan đến bài học thì học viên sẽ được hỗ trợ qua kênh nào?", "Bạn sẽ được hỗ trợ 24/7 qua các kênh online như facebook... hoặc được hỗ trợ trực tiếp tại trung tâm."));
        list.add(new Faq(5, 0, "Ngoài những khóa học đang có, trung tâm có dự định mở thêm những khóa học nào khác nữa không?", "Ngoài những khóa đang giảng dạy, ANEST sẽ mở thêm các khóa học lập trình khác nếu học viên mong muốn và đủ số lượng mở lớp. ANEST luôn luôn lắng nghe các phản hồi và mong muốn của học viên để mang lại những trải nghiệm tốt nhất khi học tại ANEST."));
        list.add(new Faq(6, 1, "Tomcat started on port(s)?", "Started MyApplication in 2.351 seconds"));
        list.add(new Faq(6, 1, "Tomcat started on port(s)?", "Started MyApplication in 2.351 seconds"));
        list.add(new Faq(6, 1, "Tomcat started on port(s)?", "Started MyApplication in 2.351 seconds"));
        return list;
    }
}
