package com.self.mybatis.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Emp {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.emp_no
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    private Integer empNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.emp_name
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    private String empName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.job
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    private String job;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.mgr
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    private Integer mgr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.hiredate
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    private Date hiredate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.sal
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    private BigDecimal sal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.comm
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    private BigDecimal comm;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.dept_no
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    private Integer deptNo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.emp_no
     *
     * @return the value of emp.emp_no
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    public Integer getEmpNo() {
        return empNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.emp_no
     *
     * @param empNo the value for emp.emp_no
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.emp_name
     *
     * @return the value of emp.emp_name
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.emp_name
     *
     * @param empName the value for emp.emp_name
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.job
     *
     * @return the value of emp.job
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    public String getJob() {
        return job;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.job
     *
     * @param job the value for emp.job
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.mgr
     *
     * @return the value of emp.mgr
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    public Integer getMgr() {
        return mgr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.mgr
     *
     * @param mgr the value for emp.mgr
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.hiredate
     *
     * @return the value of emp.hiredate
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    public Date getHiredate() {
        return hiredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.hiredate
     *
     * @param hiredate the value for emp.hiredate
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.sal
     *
     * @return the value of emp.sal
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    public BigDecimal getSal() {
        return sal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.sal
     *
     * @param sal the value for emp.sal
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.comm
     *
     * @return the value of emp.comm
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    public BigDecimal getComm() {
        return comm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.comm
     *
     * @param comm the value for emp.comm
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    public void setComm(BigDecimal comm) {
        this.comm = comm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.dept_no
     *
     * @return the value of emp.dept_no
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    public Integer getDeptNo() {
        return deptNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.dept_no
     *
     * @param deptNo the value for emp.dept_no
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }
}