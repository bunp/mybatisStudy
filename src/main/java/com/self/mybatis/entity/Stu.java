package com.self.mybatis.entity;

public class Stu {
    private Integer stuId;
    private String stuName;
    private Integer classId;
    private ClassName className;
    public Stu(Integer stuId, String stuName, Integer classId) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.classId = classId;
    }

    public ClassName getClassName() {
        return className;
    }

    public void setClassName(ClassName className) {
        this.className = className;
    }



    public Stu() {
    }

    @Override
    public String toString() {
        return "Stu{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", classId=" + classId +
                ", className=" + className +
                '}';
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }
}
