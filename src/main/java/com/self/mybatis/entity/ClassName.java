package com.self.mybatis.entity;

import java.util.List;

public class ClassName {
    private Integer classId;
    private String className;
    private List<Stu> stus;

    @Override
    public String toString() {
        return "ClassName{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                ", stus=" + stus +
                '}';
    }

    public List<Stu> getStus() {
        return stus;
    }

    public void setStus(List<Stu> stus) {
        this.stus = stus;
    }

    public ClassName() {
    }

    public ClassName(Integer classId, String className) {
        this.classId = classId;
        this.className = className;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
