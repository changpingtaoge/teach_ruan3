package com.tt.teach.pojo;

import java.io.Serializable;
/**
 * @作者：matao
 * @时间：2018/12/19 0019 下午 2:31
 * @描述：实体类Subject——》对应数据库科目表
*/
public class Subject implements Serializable{
    private Integer subjectNo;
    private String subjectName;
    private Integer classHour;
    private Integer gradeID;

    public Integer getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(Integer subjectNo) {
        this.subjectNo = subjectNo;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Integer getClassHour() {
        return classHour;
    }

    public void setClassHour(Integer classHour) {
        this.classHour = classHour;
    }

    public Integer getGradeID() {
        return gradeID;
    }

    public void setGradeID(Integer gradeID) {
        this.gradeID = gradeID;
    }

    public Subject() {
    }

    public Subject(Integer subjectNo, String subjectName, Integer classHour, Integer gradeID) {
        this.subjectNo = subjectNo;
        this.subjectName = subjectName;
        this.classHour = classHour;
        this.gradeID = gradeID;
    }
}
