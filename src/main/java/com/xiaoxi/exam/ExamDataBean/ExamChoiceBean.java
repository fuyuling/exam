package com.xiaoxi.exam.ExamDataBean;

import java.util.List;
/**
 * exam的实体类
 */
public class ExamChoiceBean {

    private int id;
    private String name;
    private List<ExamSet> examSet;

    public class ExamSet{
        private int type;
        private char title;
        private char optionA;
        private char optionB;
        private char optionC;
        private char optionD;
        private char optionE;
        public char getTitle() {
            return title;
        }
        public int getType() {
            return type;
        }
        public void setTitle(char title) {
            this.title = title;
        }

        public void setType(int type) {
            this.type = type;
        }

    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExamSet(List<ExamSet> examSet) {
        this.examSet = examSet;
    }

    public List<ExamSet> getExamSet() {
        return examSet;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
