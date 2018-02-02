package com.xiaoxi.exam;

import com.xiaoxi.exam.ExamDataBean.ExamChoiceBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ExamMBAComprehensiveController {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public Object examListRepository() {
        return jdbcTemplate.queryForList("select * from mba_comprehensive_exam_2017");
    }

    @RequestMapping(value = "mba_comprehensive_exam_2017")
    public Object getExamList() {
        List<ExamChoiceBean.ExamSet> examList = (List<ExamChoiceBean.ExamSet>) examListRepository();
        ExamChoiceBean examBean = new ExamChoiceBean();
        examBean.setExamSet(examList);
        examBean.setId(1);
        examBean.setName("mba_comprehensive_exam_2017");

        return examBean;
    }
}