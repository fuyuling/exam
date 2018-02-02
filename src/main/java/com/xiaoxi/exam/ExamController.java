package com.xiaoxi.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
public class ExamController {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public Object examListRepository() {
        return jdbcTemplate.queryForList("select * from software_designer_exam_2017");
    }

    @RequestMapping(value = "exam")
    public Object getExamList() {
        List<ExamBean.ExamSet> examList = (List<ExamBean.ExamSet>) examListRepository();
        ExamBean examBean = new ExamBean();
        examBean.setExamSet(examList);
        examBean.setId(1);
        examBean.setName("software_designer_exam_2017");

        return examBean;
    }

}
